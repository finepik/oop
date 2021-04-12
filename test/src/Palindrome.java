public class Palindrome {
    public static void main(String[] args) {
        for (int j = 2; j < 100; j++) {
            boolean la = true;
            for (int i = 2; i < j; i++) {
                if ((j % i == 0)) {
                    la = false;

                }

            }
            if (la) {
                System.out.println(j+"Число простое");
            }
        }
    }
}
