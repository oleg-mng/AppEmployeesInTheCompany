package com.olegmng;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Класс EmployeePool - поле сотрудников
 * инициализируем пулом сотрудников Employee
 */

public class EmployeePool {
    private ArrayList<Employee> empCompany = new ArrayList<>(Arrays.asList(
            new Employee(1, "+77077117111", "Dev1", LocalDateTime.of(2020, 5, 5, 1, 1)),
            new Employee(2, "+77077117122", "Dev2", LocalDateTime.of(2020, 5, 5, 1, 1)),
            new Employee(3, "+77077117133", "Dev3", LocalDateTime.of(2021, 5, 5, 1, 1)),
            new Employee(4, "+77077117144", "Dev4", LocalDateTime.of(2021, 5, 5, 1, 1)),
            new Employee(5, "+77077117199", "Dev4", LocalDateTime.of(2021, 5, 5, 1, 1)),
            new Employee(6, "+77077117155", "Dev5", LocalDateTime.of(2022, 5, 5, 1, 1))));

    // метод поиска сотрудников по заданому стажу, асисмптотика O(n) так как проводим итерацию
    public ArrayList<Employee> findExp(int exp) {
        ArrayList<Employee> listEmp = new ArrayList<>();
        for (Employee employee : empCompany) {
            if (Math.abs(employee.getExp() - LocalDateTime.now().getYear()) == exp) listEmp.add(employee);

        }

        if (listEmp.size() != 0) System.out.println("Сотрудник/и с указанным стажем найден/ы:");
        return listEmp;
    }

    // Метод печати ArrayList<Employee>, необходим если в листе более одного элемента
    public void printList(ArrayList<Employee> listEmp) {
        for (Employee employee : listEmp) {
            System.out.println(employee.toString());

        }

    }

    // метод поиска сотрудников по совпадению имени, в случае совпадения - выводим имя данного сотрудника
    // и его номер телефона, асисмптотика O(n) так как проводим итерацию
    // в данном методе использовали HashMap за ключ взяли номер телефона так как он уникальный,
    // а имя у разных людей может быть одинаковое
    public Map<String, String> findByName(String name) {
//        ArrayList<String> listEmp = new ArrayList<>();
        Map<String, String> mapNamePhone = new HashMap<>();
        for (Employee employee : empCompany) {
            if (employee.getName().equals(name)) {
//                listEmp.add(employee.getPhoneNumber());
                mapNamePhone.put(employee.getPhoneNumber(), employee.getName());
            }

        }
        if (mapNamePhone.size() != 0) System.out.println("Сотрудник/и с указанным именем найден/ы:");
        return mapNamePhone;
    }

    // метод поиска сотрудника по табельному номеру
    public Employee findByPersonalNumber(int personalNumber) {

        Map<String, String> mapNamePhone = new HashMap<>();
        for (Employee employee : empCompany) {
            if (employee.getPersonnelNumber() == personalNumber) {
                System.out.printf("Найден сотрудник с табельным номером %d\n", personalNumber);
                return employee;
            }

        }
        return null;
    }

    // метод добавления сотрудника в пул компании
    public ArrayList<Employee> addEmployee(Employee newEmployee) {
        empCompany.add(newEmployee);
        System.out.printf("Текущий пул сотрудников после добавления %s:\n", newEmployee.getName());
        printList(empCompany);

        return empCompany;
    }

//    public ArrayList<Employee> getEmpCompany() {
//        System.out.println("Текущий пул сотрудников:");
//        return empCompany;
//    }
}

