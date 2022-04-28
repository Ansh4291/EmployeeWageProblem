package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    // Instance variable initialization
    static final int PARTTIME = 1;
    static final int FULLTIME = 2;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HRS = 100;
    static final int Wadge_Per_Hrs = 20;
                /*
                Used the ComputeEmpWage() Method to Compute the Attendance
                 */
    public void ComputeEmpWage(String companyName, int wagePerHrs , int maxWorkingHrsPerMonth, int maxWorkingDays) {

        System.out.println("Database Of " + companyName + " Employee");
        System.out.println("Wage Per Hours " + wagePerHrs);
        System.out.println("Maximum Working Hours Per Month " + maxWorkingHrsPerMonth);
        System.out.println("Maximum Working Days " + maxWorkingDays);

        /*
       Dailyhrs , totalWage , DailyWage , WorkingHrs , TotalWorkingHrs , Day = 1 , are declared
         */
      //  int dailyhrs = 0;
        int totalWage = 0;
        int DailyWage =0;
        int workingHrs = 0;
        int totalWorkingHrs = 0;
        int day = 1;

        Random obj = new Random();

        for (day = 1; MAX_WORKING_DAYS >= day; day++) {


            int attendance = obj.nextInt(3);
//              Attendance to check the employee is full tym work or part tym work by switch case
            /*
            We use the switch case For Attendance
             */
            switch (attendance) {
                case FULLTIME:
                    workingHrs = 10;
                    System.out.println("Employee Working Fullday");
                    break;
                case PARTTIME:
                    workingHrs = 4;
                    System.out.println("Employee Working Part Time");
                    break;
//                default:
//                    workingHrs = 0;
            }
            /*
            calculating the Employee wage
            1-->> Calculating daily Wage = Working hrs multiply by Wage Per Hrs
            2 -->> Calculating  Total working hrs  = Max Working hrs
            3-->> Calculating Total Wage = Daily Wage
             */
            DailyWage += workingHrs * Wadge_Per_Hrs;
            totalWorkingHrs += MAX_WORKING_HRS;
            totalWage += DailyWage;

            System.out.println("Total Working hour for " + companyName + " Company " + totalWorkingHrs + " And Total Working days are " + MAX_WORKING_DAYS);
            System.out.println("Day is:- " + day + " Working Hours is :- " + workingHrs + " Wage is :- " + DailyWage);

        }
        System.out.println("Total wage of  " + companyName + "Company is " + totalWage);

    }
        public static void main (String[]args){
//              display the Welcome message
        System.out.println("Welcome to Employee Wage Computation Program");

        /*
        Create class method to compute Employee wage And calling the object compute Employee wage
        in the main method
         */

       EmployeeWageComputation ewc = new EmployeeWageComputation();

       ewc.ComputeEmpWage("HCL" , 40 , 100 , 25);
       ewc.ComputeEmpWage("Mphasis Ltd" , 50, 100 , 22);
    }

}
