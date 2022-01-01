package com.bridgelaz.EmpWeges;

public class EmployeeWeges {

    private static int IS_PRESENT = 1;
    //private static  IS_PRESENT = 1;
    private static int WAGE_PER_HOUR =20;
    private static int FULL_DAY_HOUR=8;
    public static void main(String[] args) {


      int  eCheck = (int) Math.floor(Math.random() * 10) % 2; //0.0 -1.0

        //System.out.println(eCheck);
        int eWage=0;

        if (eCheck == IS_PRESENT){
            System.out.println("Employee is Present");
            eWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee Wages Details :- "+eWage);

    }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
