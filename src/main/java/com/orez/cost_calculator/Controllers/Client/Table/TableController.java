package com.orez.cost_calculator.Controllers.Client.Table;

import com.orez.cost_calculator.Models.Table.TableModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TableView<TableModel> billTbl, debtTbl, expenseTbl, incomeTbl, savingTbl;

    @FXML
    private TableColumn<TableModel, String> bill_name, bill_due;
    @FXML
    private TableColumn<TableModel, Double> bill_budget, bill_actual, bill_diff;

    @FXML
    private TableColumn<TableModel, String> debt_name;
    @FXML
    private TableColumn<TableModel, Double> debt_budget, debt_actual, debt_diff;

    @FXML
    private TableColumn<TableModel, String> expense_name;
    @FXML
    private TableColumn<TableModel, Double> expense_budget, expense_actual, expense_diff;

    @FXML
    private TableColumn<TableModel, String> income_name, income_start, income_payday;
    @FXML
    private TableColumn<TableModel, Double> income_expected, income_actual;

    @FXML
    private TableColumn<TableModel, String> saving_name;
    @FXML
    private TableColumn<TableModel, Double> saving_budget, saving_actual, saving_diff;

    @FXML
    private Label budget_lbl, toSpend_lbl, totalExpense_lbl, totalIncome_lbl;

    public void setCellValues() {
        // Bill Table
        bill_name.setCellValueFactory(new PropertyValueFactory<>("name_column"));
        bill_due.setCellValueFactory(new PropertyValueFactory<>("due_column"));
        bill_budget.setCellValueFactory(new PropertyValueFactory<>("budget_column"));
        bill_actual.setCellValueFactory(new PropertyValueFactory<>("actual_column"));
        bill_diff.setCellValueFactory(new PropertyValueFactory<>("diff_column"));

        // Debt Table
        debt_name.setCellValueFactory(new PropertyValueFactory<>("name_column"));
        debt_budget.setCellValueFactory(new PropertyValueFactory<>("budget_column"));
        debt_actual.setCellValueFactory(new PropertyValueFactory<>("actual_column"));
        debt_diff.setCellValueFactory(new PropertyValueFactory<>("diff_column"));

        // Expense Table
        expense_name.setCellValueFactory(new PropertyValueFactory<>("name_column"));
        expense_budget.setCellValueFactory(new PropertyValueFactory<>("budget_column"));
        expense_actual.setCellValueFactory(new PropertyValueFactory<>("actual_column"));
        expense_diff.setCellValueFactory(new PropertyValueFactory<>("diff_column"));

        // Income Table
        income_name.setCellValueFactory(new PropertyValueFactory<>("name_column"));
        income_start.setCellValueFactory(new PropertyValueFactory<>("start_column"));
        income_payday.setCellValueFactory(new PropertyValueFactory<>("payday_column"));
        income_expected.setCellValueFactory(new PropertyValueFactory<>("expected_column"));
        income_actual.setCellValueFactory(new PropertyValueFactory<>("actual_column"));

        // Saving Table
        saving_name.setCellValueFactory(new PropertyValueFactory<>("name_column"));
        saving_budget.setCellValueFactory(new PropertyValueFactory<>("budget_column"));
        saving_actual.setCellValueFactory(new PropertyValueFactory<>("actual_column"));
        saving_diff.setCellValueFactory(new PropertyValueFactory<>("diff_column"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setCellValues();
        setDataToTable();
    }

    public void setDataToTable(){
        TableModel bill = new TableModel();
        bill.setName_column("Internet");
        bill.setDue_column("Feb-12");
        bill.setBudget_column(60.00);
        bill.setActual_column(60.00);
        bill.setDiff_column(0.00);
        billTbl.getItems().add(bill);
        TableModel[] ar = {bill};
        ObservableList<TableModel> tableModelObservableList = FXCollections.observableArrayList(ar);
        billTbl.setItems(tableModelObservableList);
    }
}
