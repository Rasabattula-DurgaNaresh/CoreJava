package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * @created 16/03/2025 - 11:20
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Getter
@Setter
@ToString
public class Employee {
    private int id = 0;
    private String name = null;
    private String department = null;
    private String city = null;
    private Address address = null;
    private Manager manager = null;
    private boolean isExecutive = false;
    private boolean senior = false;
    private int ratings = 10;

    public Employee(int id) {
        this.id = id;
        this.name = "Mars Man";
        address = new Address();

        address.setAddressLine1("11");
        address.setAddressLine2("Spacelane");
        address.setCountry("Mars");
        address.setCode("12AB102D1");
    }

    public Employee(int id, String name, String department) {
        setId(id);
        setName(name);
        setDepartment(department);
    }

    public Employee(int id, String name, String department, boolean isExec) {
        setId(id);
        setName(name);
        setDepartment(department);
        setExecutive(isExec);
    }

    public Employee(int id, String name, String department, String city) {
        setId(id);
        setName(name);
        setDepartment(department);
        setSenior(true);
        setCity(city);
    }

    public boolean isManager(Employee manager) {
        return getManager().equals(manager);
    }

}
