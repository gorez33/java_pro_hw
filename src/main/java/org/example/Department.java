package org.example;

public class Department {
    private String name;
    private int numberOfEmployees;
    private Company company;

    public Department(String name, int numberOfEmployees, Company company) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
