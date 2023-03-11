package com.oop.leap_ahead_x.repos;

import com.oop.leap_ahead_x.domain.Vendor;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VendorRepository extends JpaRepository<Vendor, UUID> {
}