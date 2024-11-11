package com.example.ebankify.dto;

import com.example.ebankify.domain.enums.InvoiceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceDto {
    private Long id;
    private double amountDue;
    private Date dueDate;
    private UserDto user;
    private InvoiceStatus status;
}
