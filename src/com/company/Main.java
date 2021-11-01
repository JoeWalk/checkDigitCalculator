package com.company;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int barcode[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        boolean valid = false;
        while(!valid){
            try {
                for(int i=0; i<12; i++){
                    System.out.println("Enter the next digit of the barcode");
                    int barcodeDigit = input.nextInt();
                    barcode[i] = barcodeDigit;
                    valid = true;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Type a number " + e);
                input.next();
            }
            int equ1 = (barcode[0] + barcode[2] + barcode[4] + barcode[6] + barcode [8] + barcode[10]) * 3;
            int equ2 = barcode[1] + barcode[3] + barcode[5] + barcode[7] + barcode [9] + barcode[11];
            int equ3 = equ1 + equ2;
            int equ4 = equ3 % 10;
            int checkDigit = 10 - equ4;
            barcode[12] = checkDigit;
            Arrays.toString(barcode);
            System.out.println(barcode[12]);
            System.out.println(barcode[10]);
        }
    }
}






