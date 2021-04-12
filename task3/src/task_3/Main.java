package task_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Object[][] arr = {{"Nice", 942208},
                {"Abu Dhabi", 1482816},
                {"Naples", 2186853},
                {"Vatican City", 572}};

        millionsRounding(arr);
        for (int i = 0; i < arr.length; i++){
            for (int j=0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(rps("scissors", "scissors"));
        int[] mass = {2, 8, 7, 5};
        System.out.println(warOfNumbers(mass));
        System.out.println(reverseCase("Hello World!"));
        System.out.println(inatorInator("Shrink"));
        System.out.println(totalDistance(36.1, 8.6, 3, true));
        int[] M = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println(mean(M));
        System.out.println(parityAnalysis(12));
    }
    public static Object[][] millionsRounding(Object[][] mass) {
        for (int i = 0; i < mass.length; i++){
            if ((Integer)mass[i][1]%1000000>=500000) {
       mass[i][1] = ((Integer)mass[i][1] / 1000000 +1)*1000000;
        }
        else{
            mass[i][1] = ((Integer)mass[i][1] / 1000000)*1000000;
        }
        }
       return mass;



    }

    public static double[] otherSides(double a) {
        double root3;
        root3 = Math.sqrt(3);
        double[] mass = {(Double) Math.floor(2 * a * 100) / 100.0, (Double) Math.floor(Math.sqrt(3) * a * 100) / 100.0};//округляет в меньшую сторону, из-за умножения на 100 там трехзначное число
        return mass;
    }

    public static String rps(String a, String b) {

        if (a == "rock")
            if (b == "paper")
                return "Player 2 win";
            else if (b == "scissors")
                return "Player 1 win";
        if (a == "paper")
            if (b == "rock")
                return "Player 1 win";
            else if (b == "scissors")
                return "Player 2 win";
        if (a == "scissors")
            if (b == "paper")
                return "Player 1 win";
            else if (b == "rock")
                return "Player 2 win";
        return "TIE";
    }

    public static int warOfNumbers(int[] mass) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < mass.length; i++) {


            if (mass[i] % 2 == 0) {
                a = a + mass[i];
            } else {
                b = b + mass[i];
            }
        }
        return Math.abs(a - b);
    }

    public static String reverseCase(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            result = result + str.charAt(i);
        }
        return result;
    }
    public static String inatorInator(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            }

        return result;
    }
//    public static String inatorInator(String str) {
//        char[] a= {'a', 'e', 'i', 'o', 'u', 'y'};
//        boolean lastIsVowel = false;
//        for (char c : vowels) {
//            if (c == str.toCharArray()[str.length() - 1]) {
//                lastIsVowel = true;
//            }
//        }
//        if (lastIsVowel) return str + "-inator " + str.length() + "000";
//        else return str + "inator " + str.length() + "000";
//    }
//    public static boolean doesBrickFit(int a, int b, int c , int h,int w){
//        double result;
//        result=b*0.05*c+b;
//        if(d==true){
//            result=result*0.1+result;
//        }}
    public static double totalDistance(double a, double b, double c , boolean d){
double result;
result=b*0.05*c+b;
if(d==true){
    result=result*0.1+result;
}
        return Math.round((a*100/result)*  100) / 100.0 ;//округляет до 2х знаков //8 про топливо

    }
    public static double mean(int mass[]){
        double result;
        result = 0;
      for (int i=0; i<mass.length; i++) {
          result=result+mass[i];

        }
        return Math.round((result/ mass.length)*  100) / 100.0;
    }
    public static boolean parityAnalysis(int a){
        int result, dig;
        dig=a;
        result = 0;
        while (a>0){
            result=result+a%10;
        a=a/10;
        }

        return ((dig%2==0)&&(result%2==0))||((dig%2!=0)&&(result%2!=0));
    }
}