package lab5;

import java.util.Scanner;

//1. method for input data  (10)
//2. method for show data in array
//3. method to find average value in arry
//4. method to find maximum value in arry
//5. method to find minimum value in arry
public class arryOperator {
    public static final int MAX = 10;
    public static void main(String[] args) {
        int myarray[] = new int[MAX];
        myarray = inputData(myarray);
        showData(myarray);
        //find average
        findAverage(myarray);
        //find Max
        findMax(myarray);
        //find min
        findmin(myarray);

    }  //main

    private static void findmin(int[] myarray) {
        int min = myarray[0];
        for (int i = 0; i < myarray.length; i++) {
            if (min>= myarray[i])
                min= myarray[i];
        }
        System.out.println("The maximum value is "+min);
    }

    private static void findMax(int[] myarray) {
        int max = myarray[0];
        for (int i = 0; i < myarray.length; i++) {
            if (max<=myarray[i])
                max = myarray[i];
        }
        System.out.println("The maximum value is "+max);
    }

    private static void findAverage(int[] myarray) {
        int total = 0;
        for (int val:myarray)
            total += val;
        System.out.println("The average value is "+(total/MAX));
    }




    private static void showData(int[] myArray) {
        System.out.println("Data in array: ");
        for (int val:myArray)
            System.out.print(val+"\t");
        System.out.println();
    }

    private static int[] inputData(int[] myArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integers: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("integer "+i+": ");
            myArray[i] = sc.nextInt();
        }
        return myArray;


    }


}//class