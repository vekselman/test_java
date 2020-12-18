package com.study.create_design.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for witch the bill be generated: ");
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        String planName = bufferedReader.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(bufferedReader.readLine());

        abstract_Plan plan = getPlanFactory.getPlan(planName);

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");

        plan.getRate();
        plan.calculateBill(units);
    }
}
