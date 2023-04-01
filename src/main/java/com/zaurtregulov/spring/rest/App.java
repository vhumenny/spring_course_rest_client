package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//
//        System.out.println(allEmployees);
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee emp = new Employee(9,"Sveta", "Alekseeva", "IT", 1500);
//        communication.saveEmployee(emp);
//
        communication.deleteEmployee(9);

    }
}
