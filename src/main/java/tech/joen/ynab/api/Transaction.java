package tech.joen.ynab.api;

import java.math.BigDecimal;
import java.time.Instant;

public record Transaction(
    Instant time, 
    BigDecimal amount, 
    String payee, 
    String memo
) {}
