package org.example;

public class StaffEmployee extends Employee {
    public StaffEmployee(String fullName, String position, double salary, Department department) {
        super(fullName, position, salary, department);
    }
}

class ContractEmployee extends Employee {
    private int contractPeriod;

    public ContractEmployee(String fullName, String position, double salary, Department department, int contractPeriod) {
        super(fullName, position, salary, department);
        this.contractPeriod = contractPeriod;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }
}
