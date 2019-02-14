package com.hashmap.questions.printpascaltriangle;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    private  ArrayList<ArrayList<Integer>> aList ;

    private ArrayList<Integer> a[]=new ArrayList[7];
    public PascalTriangle( ){
        aList = new ArrayList<ArrayList<Integer> >(1);

    }
    public void pascalintoArrayList(int n ){
        int x=0;
        char y=' ';
        x=y;
        for(int i=0;i<n;i++){
            a[i]=new ArrayList<Integer>();
            for(int j=n;j>i+1;j--){
                a[i].add(x);
            }
            int number=1;
            for(int k=0;k<=i;k++)
            {
                a[i].add(number);
                a[i].add(x);
                number =  number * (i - k) / (k + 1);
            }

            aList.add(a[i]);
        }

    }
    public void printPascal(){
        int x;
        Integer xi=6;
        char s;


        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                if((char)(x=aList.get(i).get(j))==' '){
                    System.out.print(' ');
                    System.out.print(' ');
                }else {
                    System.out.print(aList.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        PascalTriangle p= new PascalTriangle();
        p.pascalintoArrayList(n);
        p.printPascal();

    }
}
