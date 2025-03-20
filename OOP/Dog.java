package OOP;
// inheritance
/*
public class Dog extends Animal{
    public  void sua() {
        System.out.println("gau gau");
    }
}
*/

// encapsulation
/*
public class Dog {
    public String dogName;
    public void sua() {
        System.out.println("gau gau");
    }
}*/

// polymorphism (overriding method && overloading method)
/*
public class Dog extends Animal{
    // overriding
    public void sua() {
        System.out.println("gau gau");
    }

    // overloading
    public void sua(String soundOfSua) {
        System.out.println(soundOfSua);
    }
}*/

// abstract class && interface
/*
public class Dog extends Animal {
    @Override
    public void sua() {
        System.out.println("gau gau");
    }
}*/

// abstract interface
public class Dog implements Animal{
    @Override
    public void sua() {
        System.out.println("gau gau");
    }
}