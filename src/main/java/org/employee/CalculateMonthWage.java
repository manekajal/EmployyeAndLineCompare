package org.employee;

public class CalculateMonthWage {

    public static void main(String[] args) {
        int hours = 8;
        int days = 20;
        double salaryDaily, salaryMonthly;
        int wagePerHour = 20;

        salaryDaily = hours * wagePerHour;
        salaryMonthly = salaryDaily * 20;

        System.out.println(" Employee Monthly Salary : " + salaryMonthly);

    }
}

