package com.bridgeLabz;
import java.util.*;
public class EmployeeWageOops {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.EmployeeCheck();
    }
}
class Attendance{
    int IS_PRESENT = 1;

    int EmployeePresent(int a) {
        Random r = new Random();
        int empCheck = r.nextInt(a);
        return empCheck;
    }
     void EmployeeCheck() {
        int empCheck = EmployeePresent(2);
        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is present");
        } else
            System.out.println("Employee is Absent");
    }
}