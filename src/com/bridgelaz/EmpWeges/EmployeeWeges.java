package com.bridgelaz.EmpWeges;

public class EmployeeWeges {

    private static int IS_PRESENT = 1;
    private static int WAGE_PER_HOUR =20;
//    private static int FULL_DAY_HOUR=8;
    private static int IS_PART_TIME=1;
    private static int IS_FULL_TIME=2;

    public static void main(String[] args) {


      int  eCheck = (int) Math.floor(Math.random() * 10) % 2; //0.0 -1.0

        //System.out.println(eCheck);
        int eWage=0;
        int eHrs=0;

        if (eCheck == IS_PRESENT){
            eHrs=4;
           }
        else if(eCheck == IS_FULL_TIME) {
            eHrs = 8;
        }
        else
        {
            eHrs=0;
            System.out.println("Employee is Absent");
        }
         eWage= WAGE_PER_HOUR*eHrs;
        System.out.println("Employee Wages Details :- "+eWage);
    }
}
