package com.bridgelabz;

public class CompanyEmpWage {
    public final String company;
    public final int Wadge_Per_Hrs;
    public final int MAX_WORKING_DAYS;
    public final int MAX_WORKING_HRS;
    int totalWage;

    public CompanyEmpWage(String company , int MAX_WORKING_DAYS , int MAX_WORKING_HRS , int wadge_Per_Hrs){

        this.company = company;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
        this.Wadge_Per_Hrs = wadge_Per_Hrs;
    }
    public void setTotalWage(int totalWage){
        this.totalWage = totalWage;
    }
    public String toString(){
        return "Total employe wage for comapny :- " + company + " is :- " + totalWage;
    }

}
