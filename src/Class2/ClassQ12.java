package Class2;

public class ClassQ12 {
    public static void main(String args[])
    {
        int x = 4,y = 97;
        String type = "Narrowing";

        switch(type){
            case "Widening":
                float f = x;
                System.out.println(f);
                break;
            default:
                System.out.println((char)y);
        }
    }
}
