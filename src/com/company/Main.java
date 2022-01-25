package com.company;

public class Main {

    public static void main(String[] args) {
        //Highs
        int[] high = {45, 29, 10, 22, 41, 28, 33};
        //Precipitation
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        //Days of the week
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < days.length; i++) {
            if (precipitation[i] > 50 && high[i] <= 32){
                System.out.println(days[i] + " | " + precipitation[i] + "% precipitation | high:" + high[i]);
            }
        }
    }
}
