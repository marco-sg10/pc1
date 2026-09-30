package com.tuckersoft.pc1.entity;

import com.tuckersoft.pc1.enums.StatusEquipment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "equipment_slots")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EquipmentSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "laboratory_id", nullable = false)
    private Laboratory laboratory;

    @Column(nullable = false)
    private String equipmentCode;

    @Column(nullable = false)
    private ZonedDateTime startTime;

    @Column(nullable = false)
    private ZonedDateTime endTime;

    @Column(nullable = false)
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    private StatusEquipment status;
}
