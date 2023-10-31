package com.olegmng;

import java.time.LocalDateTime;

/**
 * class Employee - сотрудник компании
 *
 * @personnelNumber - табельный номер
 * @phoneNumber - номер телефона
 * @name - имя
 * @exp - стаж работы
 */

public class Employee {
    private int personnelNumber;
    private String phoneNumber;
    private String name;
    private LocalDateTime exp;

    public Employee(int personnelNumber, String phoneNumber, String name, LocalDateTime exp) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.exp = exp;
    }

    public int getExp() {
        return exp.getYear();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    @Override
    public String toString() {
        return "{" +
               "personnelNumber=" + personnelNumber +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", name='" + name + '\'' +
               ", exp=" + exp +
               '}';
    }
}
