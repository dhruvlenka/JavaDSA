package OOPS.Interface;

interface V {
    int x = 10;
    public void start();
}

/*
after compile it will be like:

interface Vehicle {
    public static final int x = 10;
    public abstract void start();
}

 */
public class InterfaceProgram {
    public static void main(String[] args) {

    }
}
