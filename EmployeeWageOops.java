package com.bridgeLabz;
import java.util.*;
public class EmployeeWageOops {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.DailyWageCheck();
    }
}
class Attendance{
    int IS_PRESENT = 1;
	int IS_ABSENT = 0;
    int WAGE_PER_HOUR = 20;
    int IS_FULL_TIME = 8;
	int IS_PART_TIME = 4;
    int DailyWage = 0;

    int EmployeePresent(int a) {
        Random r = new Random();
        int EmpCheck = r.nextInt(a);
        return EmpCheck;
    }
     void DailyWageCheck() {
        int EmpCheck = EmployeePresent(2);
        switch (EmpCheck) {
			case IS_PRESENT:{
				System.out.println("Employee is present");
				DailyWage = WAGE_PER_HOUR * IS_FULL_TIME;
				break;
			}
			case IS_ABSENT:{
				System.out.println("Employee is Absent");
				DailyWage = DailyWage;
				break;
		}
        System.out.println("Daily Wage : " + DailyWage);
    }
}