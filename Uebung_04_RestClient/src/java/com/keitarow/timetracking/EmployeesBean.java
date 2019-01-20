/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keitarow.timetracking;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.restlet.resource.ClientResource;

/**
 *
 * @author Benedikt
 */
@ManagedBean
@ViewScoped
public class EmployeesBean {
    Employee employee;
    Employees employees;
    Entries entries;
    String loginname;
    
    public EmployeesBean() {
        IEmployeesResource employeesObjectClient = ClientResource.create("http://localhost:8083/employees", IEmployeesResource.class);
        loginname = "";
        employees = employeesObjectClient.retrieve();
        employee = new Employee();
        employee.account = new Logininfo();
        employee.account.loginname = "";
        employee.account.password = "";
        employee.account.role = "";
        employee.address = new Address();
        employee.address.houseno = BigInteger.valueOf(-1);
        employee.address.street = "";
        employee.address.town = BigInteger.valueOf(-1);
        employee.birthdate = null;
        employee.dept = "";
        employee.id = BigInteger.valueOf(-1);
        employee.name = new Personname();
        employee.name.firstname = "";
        employee.name.surname = "";
        employee.sex = RestrictedSex.MALE;
        entries = new Entries();
        entries.entry = new ArrayList<>();
    }
    
    public TreeMap<String, Integer> getEmployeesTreeMap() {
        TreeMap<String, Integer> employees = new TreeMap<>();
        for (Employee emp : this.employees.getEmployee()) {
            employees.put(emp.account.loginname, emp.id.intValue());
        }
        return employees;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Entries getEntries() {
        return entries;
    }

    public void setEntries(Entries entries) {
        this.entries = entries;
    }
    
    public String getEmployeeName(BigInteger employeeID) {
        for (Employee emp : employees.getEmployee()) {
            if (emp.id.compareTo(employeeID) == 0) {
                return emp.name.firstname + " " + emp.name.surname;
            }
        }
        return "";
    }
    
    public List<String> getLoginnameList() {
        List<String> list = new ArrayList<>();
        for (Employee emp : employees.getEmployee()) {
            list.add(emp.account.loginname);
        }
        return list;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
    
    public void requestEmployee() {
        IEmployeeResource employeeObjectClient = ClientResource.create("http://localhost:8083/employees/" + loginname, IEmployeeResource.class);
        employee = employeeObjectClient.retrieve();
    }
    
    public void requestEntries() {
        IEntriesResource entriesObjectClient = ClientResource.create("http://localhost:8083/employees/" + loginname + "/entries", IEntriesResource.class);
        entries = entriesObjectClient.retrieve();
    }
    
    public void requestData() {
        requestEmployee();
        requestEntries();
    }
}
