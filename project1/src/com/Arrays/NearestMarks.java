package com.Arrays;

public class NearestMarks {

    public static void main(String[] args) {

        int marks[] = {35, 41, 29, 72, 87};

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.round(marks[i] / 10.0) * 10);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}