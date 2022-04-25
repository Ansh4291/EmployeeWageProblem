package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int PartTimeHrs = 8;
         int emprateperhrs = 20;
         final int FullTimeHrs = 10;
         int salary = 0;
        int dailyhrs = 0;
         int WORKING_DAYS = 20;
        int WAGE_PER_HR = 20;
        int MAX_WORKING_DAYS = 20;
        int MAX_WORKING_HRS = 100;

        Random obj = new Random();
        int attendance = obj.nextInt(3);

        int totalWage = 0;
        int workingHrs = 0;
        var totalWorkingHrs = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
            workingHrs = 0;

            switch (attendance) {
                case 0:
                    System.out.println("Employee Full Time Work");
                    salary = FullTimeHrs * emprateperhrs;
                    break;

                case 1:
                    System.out.println("Employee is Part Time Work");
                    salary = PartTimeHrs * emprateperhrs;
                    break;

                default:
                    System.out.println("Employee is absent");
                    salary = dailyhrs * emprateperhrs;
                    break;
            }
            int dailyWage = workingHrs * WAGE_PER_HR;
            System.out.println("Day " + day + " workingHrs is " + workingHrs + " wage is: " + dailyWage);
            totalWage += dailyWage;
        }
        System.out.println("Total wage for a month is " + totalWage);
            System.out.println(salary);

        }
    }


