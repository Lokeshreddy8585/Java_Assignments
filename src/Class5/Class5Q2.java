package Class5;
//Hierarchical Inheritance

class Parent1{
    void car(){
        System.out.println("Wanna buy this Car");
    }
}
class Child1 extends Parent1{
    void type(){
        System.out.println("Type of car- Coupe");
    }
}
class Child2 extends Parent1{
    void mileage(){
        System.out.println("Mileage- 25");
    }
}
public class Class5Q2 {
    public static void main(String args[]){
        Child c= new Child();
        Child2 d= new Child2();
        c.type();
        c.car();
        d.mileage();
        d.car();


    }
}
