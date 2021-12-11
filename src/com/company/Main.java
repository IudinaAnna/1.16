package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner  input=new Scanner(System.in);
     System.out.println("епервое число:");
     int x=input.nextInt();
     System.out.println("второе число:");
     int y=input.nextInt();
     if(x>y) System.out.println(x+">"+y);
     if(y>x) System.out.println(y+">"+x);
     if (x==y) System.out.println(x+"="+y);
    }
}
