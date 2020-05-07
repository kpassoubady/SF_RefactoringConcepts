package com.kavinschool.extract.subclass;

public class JobItem {
    private final int unitPrice;
    private final int quantity;
    private final Employee employee;
    private final boolean isLabor;

    public JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        this.isLabor = isLabor;
    }

    public int getTotalPrice(){
        return getUnitPrice() * quantity;
    }

    private int getUnitPrice() {
        return isLabor ? employee.getRate() : unitPrice;
    }

    public Employee getEmployee() {
        return employee;
    }
}
