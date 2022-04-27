package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
   static final int PARTTIME = 1;
   static final int FULLTIME= 2;
   static final int MAX_WORKING_DAYS = 20;
   static final int MAX_WORKING_HRS = 100;
    static final int Wadge_Per_Hrs = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dailyhrs = 0;
        int totalWage = 0;
        int DailyWage = 0;
        var workingHrs = 0;
        int totalWorkingHrs = 0;
        int day=1;

        Random obj = new Random();

        for (day=1; MAX_WORKING_DAYS >= day; day++){


        int attendance = obj.nextInt(3);

            switch (attendance) {
                case FULLTIME:
                    workingHrs=10;
                    System.out.println("Employee Working Fullday");
                    break;
                case PARTTIME:
                    workingHrs = 4 ;
                    System.out.println("Employee Working Part Time");
                    break;
                default:
                    workingHrs = 0;
            }
            DailyWage += workingHrs * Wadge_Per_Hrs;
            totalWorkingHrs += MAX_WORKING_HRS;
            totalWage += DailyWage;

            System.out.println("Day is:- " + day + " Working Hours is :- "+ workingHrs + " Wage is :- " + DailyWage);

        }
        System.out.println("Total wage for a month is " + totalWage);


        }
    }


