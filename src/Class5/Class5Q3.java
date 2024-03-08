package Class5;
//Multilevel Inheritance

class Parent2{
    void car(){
        System.out.println("Wanna buy this Car");
    }
}
class Child4 extends Parent2{
    void type(){
        System.out.println("Type of car- Coupe");
    }
}
class Child5 extends Child4{
    void mileage(){
        System.out.println("Mileage- 25");
    }
}
public class Class5Q3 {
    public static void main(String args[]){
        Child5 c= new Child5();
        c.type();
        c.mileage();
        c.car();


    }
}

