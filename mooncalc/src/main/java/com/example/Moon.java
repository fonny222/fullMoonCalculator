package com.example;

import java.util.Scanner;
public class Moon {

    // function determines the date of the next full moon
    public static void fullMoon(String month, int date, int[] array1){
        int dayOfMoon =0;

        switch (month){
            case "JANUARY":
                if(date >= array1[0]){
                    System.out.println("The next full moon will be February "+array1[1]);
                    break;
                }
                System.out.println("The next full moon will be January "+array1[0]);
                break;
            case "FEBRUARY":
                if(date >= array1[1]){
                    System.out.println("The next full moon will be March "+array1[2]);
                    break;
                }
                System.out.println("The next full moon will be February "+array1[1]);
                break;
            case "MARCH":
                if(date >= array1[2]){
                    System.out.println("The next full moon will be April "+array1[3]);
                    break;
                }
                System.out.println("The next full moon will be March "+array1[2]);
                break;
            case "APRIL":
                if(date >= array1[3]){
                    System.out.println("The next full moon will be May "+array1[4]);
                    break;
                }
                System.out.println("The next full moon will be April "+array1[3]);
                break;
            case "MAY":
                if(date >= array1[4]){
                    System.out.println("The next full moon will be June "+array1[5]);
                    break;
                }
                System.out.println("The next full moon will be May "+array1[4]);
                break;
            case "JUNE":
                if(date >= array1[5]){
                    System.out.println("The next full moon will be July "+array1[6]);
                    break;
                }
                System.out.println("The next full moon will be June "+array1[5]);
                break;
            case "JULY":
                if(date >= array1[6]){
                    System.out.println("The next full moon will be August "+array1[7]);
                    break;
                }
                System.out.println("The next full moon will be July "+array1[6]);
                break;
            case "AUGUST":
                if(date >= array1[7]){
                    System.out.println("The next full moon will be September "+array1[8]);
                    break;
                }
                System.out.println("The next full moon will be August "+array1[7]);
                break;
            case "SEPTEMBER":
                if(date >= array1[8]){
                    System.out.println("The next full moon will be October "+array1[9]);
                    break;
                }
                System.out.println("The next full moon will be November "+array1[8]);
                break;
            case "OCTOBER":
                if(date >= array1[9]){
                    System.out.println("The next full moon will be November "+array1[10]);
                    break;
                }
                System.out.println("The next full moon will be October "+array1[9]);
                break;
            case "NOVEMBER":
                if(date >= array1[10]){
                    System.out.println("The next full moon will be December "+array1[11]);
                    break;
                }
                System.out.println("The next full moon will be November "+array1[10]);
                break;
            case "DECEMBER":
                if(date >= array1[11]){
                    System.out.println("The next full moon will be January 12, 2017");
                    break;
                }
                System.out.println("The next full moon will be December "+array1[11]);
                break;
        }
    }



    //main****************************************************
    public static void main(String[] args){


        int[] year2016 = {23,22,23,21,21,20,19,18,16,15,14,13};
        String month;
        String capMonth;
        int date;
        int daysPerMonth = 0;


        Scanner inputDevice = new Scanner(System.in);

        // ask for input
        System.out.println("For the Year 2016 Answer the following questions");
        System.out.println("To learn when the next full moon is");
        System.out.println();
        System.out.println("What Month is it?");
        month = inputDevice.next();
        capMonth = month.toUpperCase();
        System.out.println();
        System.out.println();
        System.out.println("What is the current date?");
        date = inputDevice.nextInt();

        System.out.println();
        System.out.println();


        // how many days per month
        switch (capMonth){
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                daysPerMonth = 31;
                break;
            case "SEPTEMBER":
            case "APRIL":
            case "JUNE":
            case "NOVEMBER":
                daysPerMonth = 30;
                break;
            case "FEBRUARY":
                daysPerMonth = 29;
                break;
        }
// validates the date is not higher than the days of the month selected
        while(date > daysPerMonth){

            System.out.println("There is no "+month+" "+date);
            System.out.println();
            System.out.println("Please pick an actual date:");
            date = inputDevice.nextInt();
        }

        // declare function
        fullMoon(capMonth,date,year2016);

    }
}
