package Class5;

//Single Inheritance
class Parent{
     void car(){
         System.out.println("Wanna buy this Car");
     }
         }
class Child extends Parent{
    void type(){
        System.out.println("Coupe");
    }
}
public class Class5Q1 {
     public static void main(String args[]){
         Child c= new Child();
         c.type();
         c.car();


     }
}
