package OOPS;

//2) super can be used to invoke parent class method
class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class  Dog extends Animal {
    void eat(){
        System.out.println("eating meat");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();
        bark();
    }
}

class Cat extends Animal {
    void eat(){
        System.out.println("eating fish");
    }
    void meau(){
        System.out.println("meau meau");
    }
    void work(){
        super.eat();
        meau();
    }
}
public class SuperKeyword2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.work();

        System.out.println();

        Cat cat = new Cat();
        cat.work();
    }
}
