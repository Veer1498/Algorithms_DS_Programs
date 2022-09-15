package com.algorithms;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        System.out.println("welcome to Algorithm Programs");

        String [] wordList = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter WordList :");
        for (int i = 0;i < wordList.length;i++){
            wordList[i]= sc.next();
        }
        System.out.println("Please Enter Wod to Search :");
        String word = sc.next();

        Arrays.sort(wordList);
        boolean check = searchWord(wordList,word);

        if (check == true){
            System.out.println("The Word is Present : "+word);
        }
        else {
            System.out.println("Word is not Present : "+word);
        }
    }

    public static boolean searchWord(String[] wordList, String word) {
        int high = wordList.length-1;
        int low = 0;
        int mid;

        while (low<=high){
            mid = (high+low)/2;
            if (wordList[mid].compareToIgnoreCase(word) > 0){
                high = mid-1;
            } else if (wordList[mid].compareToIgnoreCase(word) < 0) {
                low = mid+1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
