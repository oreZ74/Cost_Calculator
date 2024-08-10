package com.orez.cost_calculator.Models.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableModel {

    private String name_column;
    private String due_column;
    private double budget_column;
    private double actual_column;
    private double diff_column;

    private String payday_column;
    private double expected_column;
    private String start_column;
}
