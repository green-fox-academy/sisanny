//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

public class SubInt {

    public static int subInt(int n, int array[]) {
        n = 0;
        int count = 0;
        int i = 0;

            while (array[i] > 0) {
                i++;
                array[i] = array[i] / 10;
                count++;
        }
    }

    public static void main(String[] args) {
        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
}
