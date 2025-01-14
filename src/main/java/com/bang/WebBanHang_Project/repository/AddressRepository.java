package com.bang.WebBanHang_Project.repository;

import com.bang.WebBanHang_Project.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
    AddressEntity findByUserIdAndAddressType(Long userId, Integer addressType);
}
