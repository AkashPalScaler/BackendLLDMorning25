package org.example.ParkingLot.Models;

public class Operator extends BaseClass{
    String name;
    String employeeCode;

    public Operator(String name, String employeeCode) {
        this.name = name;
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
}
