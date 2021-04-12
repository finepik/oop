package one_two;

import java.util.Scanner;

public class minute {
    public static void main(String[] args) {


        System.out.println(Convert(5));
        System.out.println(Points(13,12));
        System.out.println(footballPoints(3,4,2));
        System.out.println(divisibleByFive(5));
        System.out.println(and(true,true));
        System.out.println(howManyWalls(54, 1, 43));
        System.out.println(squared(5));
        System.out.println(profitableGamble(0.2,50,9));
        System.out.println(frames(1,1));
        System.out.println(mod(9,5));

    }

    public static int Convert(int n){ //превращает минуты в секунды

        return n*60;

    }

    public static int Points (int a,int b){ //считает очки у баскетбольных команд

        return 2*a+3*b;

    }
    public static int footballPoints(int a,int b,int c ){ // количесво очков набранных футбольной командой

      return 3*a+b+0*c;

    }
    public static boolean divisibleByFive(int n){ // проверяет делится ли число без остатка на 5

        return(n%5==0);
    }
    public static boolean and(boolean a, boolean b) { //Оператор && вернет true только для true && true

        return((a)&&(b));

    }
    public static int howManyWalls(int a,int b,int c ){ //количество полных стен, которые я могу покрасить

        return a/(b*c);


    }
    public static int squared(int b ){ //исправленный код
        return b*b;


    }
    public static boolean profitableGamble(Double a,int b,int c ){
        return(a*b>c);

    }
    public static int frames (int a,int b){ //считает количество кадров за заданное количество минут

       return(a*b*60);

    }
    public static int mod (int a,int b) { //считает остаток числа при делении


        return(a - (a/b)*b);
    }
}

