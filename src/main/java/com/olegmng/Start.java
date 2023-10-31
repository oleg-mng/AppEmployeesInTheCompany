package com.olegmng;

import java.time.LocalDateTime;

public class Start {
    public static void run() {
        EmployeePool employeePool = new EmployeePool();

        //запускаем поиск по полю - стаж работы (указывая желаемый стаж как значение в методе)
        //на выходе получаем пул сотрудников с желаемым стажем
        employeePool.printList(employeePool.findExp(2));
        //запускаем поиск по имени и если есть совпадения выводим мапу с ключом в виде номера
        // телефона и значением - имя
        System.out.println(employeePool.findByName("Dev4"));

        //проводим поиск по табельному номеру и если есть совпадение выводим все данные по сотруднику
        System.out.println(employeePool.findByPersonalNumber(3));

        //добавляем в пул нового сотрудника
        employeePool.addEmployee(new Employee(7, "+77077117188", "Dev7",
                LocalDateTime.of(2023, 7, 7, 10, 0)));
//        employeePool.printList(employeePool.getEmpCompany());
    }
}
