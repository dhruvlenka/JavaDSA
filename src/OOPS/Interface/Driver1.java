package OOPS.Interface;

public class Driver1 {
    public static void main(String[] args) {
        WebDriver1 wd = new ChromeDriver1();
        ChromeDriver1 cd = (ChromeDriver1) wd;
        cd.findElement();
        cd.get();
        cd.executeScript();
        cd.getScreenshot();

    }
}
