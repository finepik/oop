package one_two;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String str1 = scanner.next();
        String str=str1.toUpperCase().replaceAll("[^A-Za-z]", "");
        System.out.println(str);
      String reverse="";
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse))//сравнение объектов производится с помощью метода equals() класса Object, если равны, то true
        {
            System.out.println("палиндром");
        }
        else

        {
            System.out.println("не палиндром");
        }
        }
    }
