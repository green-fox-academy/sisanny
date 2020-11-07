// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {

    public static int sum(int num) {
        int sumOfFun = 0;
        for (int i = 0; i < num; i++){
            sumOfFun = num + (num + i);
        }
        return sumOfFun;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));

    }
}
