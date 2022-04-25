package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int PartTimeHrs = 8;
        int emprateperhrs = 20;
        int FullTimeHrs = 10;
        int salary = 0;
        int dailyhrs =0;


        Random obj = new Random();
        int attendance = obj.nextInt(3);

        if(attendance == 0 ) {
            System.out.println("Employee full Time Work ");

            salary=	FullTimeHrs*emprateperhrs ;
        }
        else if(attendance == 1) {
            System.out.println("Employee is Part Time Work ");

            salary=	PartTimeHrs*emprateperhrs;
        }
        else {
            System.out.println("Employee is absent ");

            salary = dailyhrs*emprateperhrs;
        }

        System.out.println(salary);

    }
    }

