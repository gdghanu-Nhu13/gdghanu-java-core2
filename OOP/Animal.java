package OOP;
// inheritance
/*public class Animal {
    public void eating() {
        System.out.println("eating now");
    }
}*/

// encapsulation
/*
public class Animal {
    private void eating() {
        System.out.println("eating now");
    }

    protected void sleep() {
        System.out.println("sleeping now");
    }
}*/

// polymorphism
/*
public class Animal {
    public void sua() {
        System.out.println("hello");
    }
}*/

// abstract
/*
abstract class Animal {
    public String feather_color;
    public int age;

    public abstract void sua();

    public void eating() {
        System.out.println("eating now");
    }
}*/

// abstract interface
public interface Animal {
    public String feather_color = "black";
    public int age = 5;

    public abstract void sua();

}