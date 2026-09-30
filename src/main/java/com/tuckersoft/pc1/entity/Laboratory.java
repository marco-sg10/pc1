package com.tuckersoft.pc1.entity;

import com.tuckersoft.pc1.enums.StatusLab;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "laboratories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String name;

    @Column(nullable = false)
    private String Location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User managerId;

    @OneToMany(mappedBy = "laboratoryId")
    private List<EquipmentSlot> equipmentSlots;

    @Enumerated(EnumType.STRING)
    private StatusLab status;
}
