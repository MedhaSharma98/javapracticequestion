package com.hashmap.questions.PatternQuestion;

import java.util.Scanner;

public class Pattern {
        public void printpattern(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            for(int i=1;i<=n-1;i++){
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }
        public static void main(String[] args) {
            Pattern p=new Pattern();
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Enter N");
            n=sc.nextInt();
            p.printpattern(n);


        }
}
