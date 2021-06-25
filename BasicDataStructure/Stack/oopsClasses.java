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
    }
}