import java.io.*;
import java.util.*;

public class oopsClasses{
    public static class person{ // class of a person
        int age;
        String name;
        void sayHi(){ // function
            System.out.println(name + " [ " + age + " ] " + "sayHi");
        }
    }
    public static void main(String[] args){
        person p1 = new person();
        p1.age = 10;
        p1.name = "Hello";
        p1.sayHi();
        
        person p2 = new person();
        p2.age = 20;
        p2.name = "World";
        p2.sayHi();

        person p3 = p1; // the p3 will copy all of p1 info
        p3.age = 40;
        p3.name = "HW";
        p3.sayHi(); //now what will happens over here is that, p3 is referencing the same instance
        p1.sayHi(); // so p1 and p3 now are both on same address
    }
}