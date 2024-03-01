package Class1;

public class Class1Q1 {
    public static void main(String args[])
    {
        int a1 = 167657889;
        float b1 = 2.6f;
        char c1 = 'g';
        short d1 = 76;
        long e1 = 655678965;

        /*Widening*/
        double a2 = a1;
        double b2 = b1;
        int c2 = c1;
        float d2 = d1;
        float e2 = e1;

        System.out.println("Widening");
        System.out.println();
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println();

        /*Narrowing*/
        System.out.println("Narrowing");
        System.out.println();
        System.out.println((long)a2);
        System.out.println((int)b1);
        System.out.println((short)c2);
        System.out.println((char)d2);
        System.out.println((int)e2);

    }
}
