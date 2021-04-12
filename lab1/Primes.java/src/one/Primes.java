package one;



public class Primes {
    public static void main(String[] args) {

        for (int j = 2; j < 100; j++) {


            if (ISprime(j)) {
                System.out.println(j+"Число простое");//если значение метода истинно, то происходит вывод
            }
        }
    }
    public static boolean ISprime(int n){ //метод определяет простое число, выявляя количество делителей

        boolean ISprime = true;
        for (int i = 2; i < n; i++) {
            if ((n % i == 0)) {
                ISprime = false;
                break;
            }
        }
        return ISprime;//возвращает булевское значение
    }
}
