// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {

    public static int factorio(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorio(6));
    }
}
