package com.bang.WebBanHang_Project.controller;

import com.bang.WebBanHang_Project.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Slf4j(topic = "EMAIL-CONTROLLER")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send-email")
    public void send(@RequestParam String to,@RequestParam String subject,@RequestParam String content) throws IOException {
        log.info("Sending Email to {}", to);

        emailService.send(to,subject,content);
        log.info("Email sent");
    }

    @GetMapping("/verify-email")
    public void emailVerification(@RequestParam String to, String name) throws IOException {
        try {
            emailService.verificationEmail(to, name);
            log.info("Verification email sent successfully!");
        } catch (Exception e) {
            log.info("Failed to send verification email.");
        }
    }
}
