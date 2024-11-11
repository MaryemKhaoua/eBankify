package com.example.ebankify.dto;


import com.example.ebankify.domain.enums.TransactionStatus;
import com.example.ebankify.domain.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {
    private Long id;
    private TransactionType type;
    private double amount;
    private TransactionStatus status;
    private AccountDto sourceAccount;
    private AccountDto destinationAccount;
}