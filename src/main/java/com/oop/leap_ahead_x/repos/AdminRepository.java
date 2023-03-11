package com.oop.leap_ahead_x.repos;

import com.oop.leap_ahead_x.domain.Admin;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, UUID> {
}