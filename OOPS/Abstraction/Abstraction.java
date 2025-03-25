package OOPS.Abstraction;

abstract class GooglePixel {
    int Pixel = 22500;
    int tax = 2500;
    String GPModel = "Google Pixel 4a";
    //abstract method: it can not have a body {}
    abstract void GPixel();
}

abstract class AppleiPhone {
    int iPhone = 41999;
    int tax = 7999;
    String Model = "iPhone 12 Mini";
    abstract void iPh();
}

class GPixel4a extends GooglePixel {
    //concreate method
    void GPixel() {
        System.out.println("Google Pixel Prize = " + Pixel);
        System.out.println("Tax = " + tax);
        System.out.println("Model = " + GPModel);
    }
}
class iPhone extends AppleiPhone {
    void iPh() {
        System.out.println("iPhone Prize " + iPhone);
        System.out.println("Tax = " + tax);
        System.out.println("Model = " + Model);
    }

    public static void main(String[] args) {
        //upcasting
        //we cannot create a object of abstract class that's why we use iPhone.
        AppleiPhone iPhMD20 = new iPhone();
        iPhMD20.iPh();
        System.out.println();

        GooglePixel googlePixel = new GPixel4a();
        googlePixel.GPixel();
    }
}
