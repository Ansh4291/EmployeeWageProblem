package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int attendance;
        int  emprateperhrs = 20;
        int emphrs = 8;
        int salary;

        Random random = new Random();

        attendance = random.nextInt(2);


        System.out.println(attendance);

        salary = attendance*emprateperhrs*emphrs;
        if(attendance == 1) {
            System.out.println(salary);
        }
        else {
            System.out.println(salary);
        }

    }
    }

