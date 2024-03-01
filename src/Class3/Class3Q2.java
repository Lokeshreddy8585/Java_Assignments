
/*while loop in java to print only numbers divisble by 6 from 1 to 200*/

package Class3;

public class Class3Q2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 200) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
