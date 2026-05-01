package tech.joen.ynab.api;

import java.util.List;

public record Account(
    String name,
    List<Transaction> transactions
    ) {}
