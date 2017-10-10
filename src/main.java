import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class main {
    public static void main(String[] args) {

        System.out.print("How many elements does your array have? ");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //number of elements
        if (n==0) {
            System.out.println("Your array must contain more than zero elements.");
            return;
        }
        int[] array = new int[n];


        //Giving values to elements of an array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < array.length; i++) {
            int value = scan.nextInt();
            array[i] = value;
        }

        System.out.print("Your Array is: ");
        for (int anArray : array) System.out.printf(anArray + " ");
        System.out.println("");



        printPosition(array, scan);
            System.out.println("");

        evenPositions(array);
            System.out.println("");

        suma(array);
            System.out.println("");

        largerThanAverage(array, n);
            System.out.println("");

        reverse(array);
            System.out.println("");

        swapping(array, n);
            System.out.println("");

        sorting(array);
    }

    public static void printPosition (int [] array, Scanner scan) {
        //printing the position in an array
        System.out.println("Enter an array index: ");
        int a = scan.nextInt() - 1 ;
        if (a > array.length || 0>a) {
            System.out.print("No element on that position.");
        } else {
            System.out.print("Element on chosen position is: " + array[a]);
        }

    }

    public static void suma (int [] array) {
        //Sum of the elements
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("The sum of elements in the array is: " + sum);
    }
    public static void evenPositions (int [] array) {
        //Elements on even postions
        System.out.printf("Elements on even positions are: ");
        for (int i = 1; i < array.length; i += 2)
            System.out.print(array[i] + " ");
    }


    public static void largerThanAverage(int[] array, int n) {
        //Printing elements that are larger than the average of an array
        System.out.print("Elements that are larger than average: ");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }


        int average = sum / n;
        for (int anArray : array) {
            if (anArray > average) System.out.print(anArray + " ");
        }
    }

    public static void reverse(int[] array) {
           //Reversed array
           System.out.print("Reversed array: ");
           for (int i = array.length - 1; i >= 0; i--) {
               System.out.printf(array[i] + " ");
           }
    }


    public static void swapping(int[] array, int n) {
        //Swapping two elements
        System.out.print("Array with elements swapped: ");

        if (n % 2 == 0) {
            for (int i = 0; i < array.length - 1; i += 2) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                System.out.print(array[i] + " " + array[i + 1] + " ");
            }
        } else {
            for (int i = 0; i < array.length - 1; i += 2) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                System.out.print(array[i] + " " + array[i + 1] + " ");
            }
            System.out.print(array[array.length - 1]);
        }

    }

    public static void sorting (int[] array) {
        //Sorting the array
        System.out.print("Sorted array: ");

        //Bubble sort
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j<array.length; j++){

                int temp = 0;
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
            System.out.print(array[i] + " ");
        }


    }


}






