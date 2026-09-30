package com.tuckersoft.pc1.entity;

import com.tuckersoft.pc1.enums.StatusReservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "lab_reservations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LabReservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String slotId;

    @Column(nullable = false)
    private Long studentId ;

    @Column(nullable = false)
    private String purpose;

    @Column(nullable = false)
    private ZonedDateTime reserveAt;

    @Enumerated(EnumType.STRING)
    private StatusReservation status;

}
