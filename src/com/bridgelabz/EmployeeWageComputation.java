package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int attendance;

        Random random = new Random();

        attendance = random.nextInt(2);

        System.out.println(attendance);

        if(attendance == 1) {
            System.out.println("Employee is present ");

        }
        else {
            System.out.println("Employee is absent");
        }
    }
    }

