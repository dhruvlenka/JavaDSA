package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class addAllMethod2 {
    public static void main(String[] args) {
        ArrayList<String> techProducts =  new ArrayList<>();
        techProducts.addAll(Arrays.asList("Macbook Pro", "iPhone15", "Lenovo Monitor", "Apple Watch"));
        System.out.println(techProducts);
    }
}
