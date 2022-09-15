package com.algorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        String [] sArray = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter some things :");
        for (int i = 0;i < sArray.length;i++){
            sArray[i]= sc.next();
        }
        String [] sortArray = insertionSorting(sArray,sArray.length);
        System.out.println("The Sorted array :");
        for(int i = 0;i<sArray.length;i++){
            System.out.println(sortArray[i]);

        }
    }

    public static String[] insertionSorting(String[] sArray, int length) {
        String temp;
        for (int j=0;j<length;j++){
            for (int k=j+1;k<length;k++){
                if (sArray[j].compareToIgnoreCase(sArray[k])>0){
                    temp = sArray[j];
                    sArray[j]= sArray[k];
                    sArray[k] = temp;
                }
            }
        }
        return sArray;
    }
}
