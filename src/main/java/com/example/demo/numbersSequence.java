package com.example.demo;
//Todo Пользователь задает последовательность целых чисел.
//Todo Сохраните ее в массив.
//Todo Узнать является ли последовательность строго возрастающей.
//Todo Строго возрастающая последовательность означает, что каждое следующее число больше предыдущего.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numbersSequence {
    //Possibility for user to enter something and for program to read something
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Asking user to enter a digit which will be an array size
        System.out.println("Please, input the quantity of numbers you would like to enter: ");
        int[] numbersSequence = new int[Integer.parseInt(READER.readLine())];
        //Filling the array in, with numbers from the user
        for (int i = 0; i < numbersSequence.length; i++) {
            System.out.println("input " + i + " element: ");
            numbersSequence[i] = Integer.parseInt(READER.readLine());
        }
        //Calling Static method for printing our array
        printArray(numbersSequence);
        /*Cycle for comparison 2 numbers in our array, checking following and previous numbers in Array,
        if following is bigger than previous than strictly increasing sequence, else will cause break of cycle that we do not have strictly increasing sequence */
        for (int i = 0; i < numbersSequence.length; i++ ) {
            if (i > 0) {
                if (numbersSequence[i - 1] >= numbersSequence[i]) {
                    System.out.println("Great, you do not have strictly increasing sequence");
                    break;
                }
            }
            if( i==numbersSequence.length-1 )
                System.out.println("Amazing, you have strictly increasing sequence");
        }
    }
    //Method for print out the array
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " element: " + numbers[i]);
        }
    }
}
