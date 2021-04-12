package geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        int range = 10;
        int nam = ((int) Math.random()*range);
        while (true) {
            System.out.println("Введите число: ");
            int scan = scanner.nextInt();
            if (scan==nam) {
                System.out.println("Вы угадали!");
                break;

            }
            else if (scan>nam)
            {System.out.println("Загаданное число меньше");

            }

            else if (scan<nam)
            {System.out.println("Загаданное число больше");

            }
            Scanner close;

        }
        }



    }

