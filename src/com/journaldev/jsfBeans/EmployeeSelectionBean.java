package com.journaldev.jsfBeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "empSelectBean")
@ViewScoped
public class EmployeeSelectionBean {
  private List<String> selectedEmployees;
  private List<String> employees;

  @PostConstruct
  public void init() {
      System.out.println("ESB@19");    
      employees = Arrays.asList("Jim", "Sara", "Tom",
              "Diana", "Tina", "Joe", "Lara", "Charlie");
  }

  public void setSelectedEmployees(List<String> selectedEmployees) {
      System.out.println("ESB@24");    
      this.selectedEmployees = selectedEmployees;
  }

  public List<String> getSelectedEmployees() {
      System.out.println("ESB@28");
      return selectedEmployees;
  }

  public List<String> getEmployees() {
      System.out.println("ESB@32");
      return employees;
  }
}