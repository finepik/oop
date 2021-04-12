package one_two;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(oppositeHouse(5,46));
        System.out.println(nameShuffle("Donald Tramp"));
        System.out.println(discount(89,20));
        int[] mass = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(mass));
        System.out.println(equal(3,1, 3));
        System.out.println(reverse("Hello World!"));
        System.out.println(programmers(147,33, 526));
        System.out.println(getXO("oooxxxx"));
        System.out.println(bomb("This goes boom!!!"));
        System.out.println(sameAscii("EdAbIt", "EdAbIt"));
    }
    public static int oppositeHouse(int a, int b){

        return (b*2+1)-a;

    }
    public static String nameShuffle(String str){
        String result;
        String[] words = str.split(" ");
        result = words[1]+" "+words[0];
        return result;

    }
    public static double discount(double a, double b){

        return (100-b)*a/100;

    }
    public static int differenceMaxMin(int[] x){
        int max,min;
        max=x[0];
        min=x[0];
        for (int i=0; i<x.length; i++){
            if(x[i]>max){
                max=x[i];
            }
            if(x[i]<min){
                min=x[i];
            }

        }
        return Math.abs(max-min);

    }
    public static int equal(int a, int b,int c){ //a b c
        if((a==b)&&(b==c)){
            return 3;
        }
        if ((a==b)||(b==c)||(a==c)){
            return 2;
        }
        else
            {return 0;}
    }
    public static String reverse(String str){
        String result="";
        for ( int i = str.length() - 1; i >= 0; i-- ) {
            result = result + str.charAt(i);
        }
        return result;
    }
    public static int programmers(int a, int b, int c ){
        int min,max;
        max=Math.max(Math.max(a,b),c);
        min=Math.min(Math.min(a,b),c);
        return max-min;

    }
    public static boolean getXO(String str){
         str=str.toLowerCase().replaceAll("[^A-Za-z]", "");
        int x=0;
        int o=0;
        for ( int i = 0; i <= str.length() - 1; i++ ) {

        if(str.charAt(i)=='x') {
            x++;
        }
        if(str.charAt(i)=='o') {
            o++;
        }
        }
        return (x==o);


    }
    public static String bomb(String str){
        str=str.toLowerCase().replaceAll("[^A-Za-z]", "");
        if (str.contains("bomb")){ //проверка на содержание указанной последовательности символов
            return"DUCK!";
        }
        else
        {
        return "Relax, there's no bomb.";
        }
    }
    public static boolean sameAscii(String a, String b){
        int x1=0;
        int x2=0;
        for ( int i = 0; i <= a.length() - 1; i++ ) {
            x1=x1+(int)a.charAt(i);
        }
        for ( int i = 0; i <= b.length() - 1; i++ ) {
            x2=x2+(int)b.charAt(i);
        }

        return (x1==x2);
    }
}
