package OOPS.Interface.Example4;

interface Greeting {
    void sayHello();

    default void sayGoodbye() {
        System.out.println("good bye");
    }

    static void welcome() {
        System.out.println("Welcome");
    }
}
