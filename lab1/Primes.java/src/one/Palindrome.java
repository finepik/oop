package one;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Объявляем Scanner
        String str1 = scanner.next();// читаем строку из консоли
        String str = str1.toLowerCase().replaceAll(" ", "");//убираем пробелы и делаем все буквы одного размера

        if (isPalindrome(str))
        {
            System.out.println("палиндром");
        }
        else

        {
            System.out.println("не палиндром");
        }


    }
    //метод, который переворачивает строку
        public static String reverseString(String line) {
            String reverse = "";
            int length = line.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + line.charAt(i);//метод charAt(int index), который возвращает символ по указанному индексу

            }
            return reverse;
    }

    public static boolean isPalindrome(String s){ //метод, который проверяет, является ли строка палиндромом
String reverse =reverseString(s);
        return s.equals(reverse);//сравнение объектов производится с помощью метода equals() класса Object, если равны, то true
    }
}

