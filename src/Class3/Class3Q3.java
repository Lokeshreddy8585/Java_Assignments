
/*do while loop in java to print from 1 to 100 in fibonacci series */

package Class3;
public class Class3Q3 {
    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;
        int next;

        System.out.println("Fibonacci numbers from 1 to 100:");

        do {
            System.out.println(curr);
            next = prev + curr;
            prev = curr;
            curr = next;
        } while (curr <= 100);
    }
}
