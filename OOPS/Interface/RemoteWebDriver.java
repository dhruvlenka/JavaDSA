package OOPS.Interface;

public class RemoteWebDriver implements WebDriver1, JavaScriptExecutor1, TakeScreenshot {
    public void findElement() {
        System.out.println("finding element from Remote Web Server.");
    }
    public void get() {
        System.out.println("getting element from Remote Web Server.");
    }
    public void executeScript(){
        System.out.println("executing script from Remote Web Server.");
    }
    public void getScreenshot() {
        System.out.println("get screenshot from Remote Web Driver.");
    }
    public void test() {
        System.out.println("testing from Remote Web Server.");
    }
    @Override
    public void test2() {
      //  WebDriver1.super.test2();
        System.out.println("override by Remove Web Server");
    }
}
