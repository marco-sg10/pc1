package com.tuckersoft.pc1.dto.response;

import com.tuckersoft.pc1.enums.StatusEquipment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EquipmentResponseDto {
    private Long id;
    private String laboratoryName;
    private String equipmentCode;
    private StatusEquipment status;
}
