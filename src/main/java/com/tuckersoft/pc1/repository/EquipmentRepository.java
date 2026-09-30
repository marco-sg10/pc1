package com.tuckersoft.pc1.repository;

import com.tuckersoft.pc1.entity.EquipmentSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<EquipmentSlot, Long> {
}
