package OOPS.Inheritance;

public class StaticBlock {

    /*
    Note: Firstly static block prints then the main() block.
     */
    static {
        System.out.println("Hi i am a first static block.");
    }

    public static void main(String[] args) {
        System.out.println("This is a Static Block Program.");
        Vehicle v1 = new Vehicle();
        System.out.println("Here, our main method ends.");
    }
    static {
        System.out.println("Hi i am second static block.");
    }

}
