package Class2;

public class Class2Q10 {
    public static void main(String args[])
    {
        int x = 4,y = 5;
        char op = '*';

        switch(op){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            case '%':
                System.out.println(x%y);
                break;
            default:
                System.out.println("Calculator");
        }
    }
}
