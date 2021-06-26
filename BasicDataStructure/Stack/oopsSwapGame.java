import java.io.*;
import java.util.*;

public class oopsSwapGame{
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
        // p1.sayHi();
        
        person p2 = new person();
        p2.age = 20;
        p2.name = "World";
        // p2.sayHi();
        
        p1.sayHi();
        p2.sayHi();
        swap(p1, p2);
        p1.sayHi();
        p2.sayHi();
    }
    public static void swap(person psn1, person psn2){
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;
        
        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}