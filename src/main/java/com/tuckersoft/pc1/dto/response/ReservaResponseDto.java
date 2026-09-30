package com.tuckersoft.pc1.dto.response;

import com.tuckersoft.pc1.enums.StatusReservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReservaResponseDto {
    private Long id;
    private Long slotId;
    private String studentUsername;
    private StatusReservation status;
}
