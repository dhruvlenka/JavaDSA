package OOPS.ClassesAndObjects;

public class Browser {
    String name; //states
    double size;  //states
    String version; //states

    public void search() {
        System.out.println("Search in browser."); //behaviour
    }

    public void reload() {
        System.out.println("Reloading web."); //behaviour
    }

    public void download() {
        System.out.println("Downloding video."); //behaviour
    }
}
