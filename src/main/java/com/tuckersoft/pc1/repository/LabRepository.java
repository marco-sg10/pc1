package com.tuckersoft.pc1.repository;

import com.tuckersoft.pc1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<User, Long> {

}
