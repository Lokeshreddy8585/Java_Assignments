package Class5;

//Multiple Inheritance - which won't work in java. So, you will get an error.
class Parent4{
    void car(){
        System.out.println("Color-blue");
    }
}
class Parent5{
    void car(){
        System.out.println("color-red");
    }
}
class Child10 extends Parent4,Parent5{
    void type(){
        System.out.println("Get the color");
    }
}
public class Class5Q5 {
    public static void main(String args[]){
        Child10 c= new Child10();
        c.type();
        c.car();


    }
}

