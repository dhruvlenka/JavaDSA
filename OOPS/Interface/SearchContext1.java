package OOPS.Interface;

public interface SearchContext1 {
    public void findElement();
    public void test();

    default void test2(){
        System.out.println("default type test2 method");
        demo();
    }
    private void demo() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
