package Class5;
//Hybrid Inheritance

class Parent3{
    void car(){
        System.out.println("Wanna buy this Car");
    }
}
class Child6 extends Parent3{
    void type(){
        System.out.println("Type of car- Coupe");
    }
}
class Child7 extends Child6{
    void mileage(){
        System.out.println("Mileage- 25");
    }
}
class Child8 extends Child7{
    void mileagehighway(){
        System.out.println("Mileage in Highway- 25");
    }
}
class Child9 extends Child7{
    void mileagecity(){
        System.out.println("Mileage in city- 17");
    }
}
public class Class5Q4 {
    public static void main(String args[]){
        Child7 c= new Child7();
        Child8 d= new Child8();
        Child9 e= new Child9();
        d.type();
        d.mileage();
        d.mileagehighway();
        e.mileagecity();
        d.car();


    }
}

