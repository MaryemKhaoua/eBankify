package com.example.ebankify.dto;

import com.example.ebankify.domain.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long id;
    private double balance;
    private String accountNumber;
    private AccountStatus status;
    private UserDto user;
}
