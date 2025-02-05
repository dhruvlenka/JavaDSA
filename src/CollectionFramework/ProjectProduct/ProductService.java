package CollectionFramework.ProjectProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    //adding the product in the array list
    public void addProduct(Product p) {
        productList.add(p);
    }

    //it will give us all the product stored in the list
    public void getAllProduct(){
        for(Product p: productList){
            System.out.println(p);
        }
    }

    public void getAllShirts(){
        for(Product p: productList){
            if(p instanceof Fashion){
                System.out.println(p);
            }
        }
    }

    //printing all the fashion
    public void getAllFashion(){
        for(Product p: productList){
            if(p instanceof Fashion){
                System.out.println(p);
            }
        }
    }

    //Fashion Category on Gender
    public void getAllFashionsOnGender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which gender category of product you want to show: ");
        String gender = sc.nextLine();

        for(Product p : productList){
            if(p instanceof Fashion fashionProduct){
                if(fashionProduct.gender.equalsIgnoreCase(gender)){
                    System.out.println(p);
                }
            }
        }
    }

    //printing all the brands of fashion
    public void getAllFashionBrands() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which brand of product you want to show: ");
        String str = sc.nextLine();

        for(Product p : productList){
            if(p.brand.equalsIgnoreCase(str)){
                System.out.println(p);
            }
        }
    }

    public void getClothingCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Clothing Category: ");
        String str = sc.nextLine();

        for(Product p : productList){
            // Check if the product is of type or object of product is actually a Fashion instance.
            /*
            (p instanceof Fashion fashionProduct):
            - This checks if the object p is an instance of the Fashion class.
	        - If p is not an instance of Fashion, the condition evaluates to false,
	          and the block inside the if statement is skipped.

	         fashionProduct: variable
	         - This is a pattern variable introduced in the same statement.
	         - If p is indeed an instance of Fashion, the variable fashionProduct is automatically
	           assigned the casting reference of p as a Fashion object.
             */

            if(p instanceof Fashion fashionProduct){
                // Fashion fashionProduct = (Fashion) p; //casting to fashion
                if(fashionProduct.clothingCategory.equalsIgnoreCase(str)){
                    System.out.println(p);
                }
            }
        }
    }

    public void getAllMobiles(){
        for(Product p: productList){
            if(p instanceof Mobile){
                System.out.println(p);
            }
        }
    }

    public void getAllLaptops(){
        for(Product p: productList){
            if(p instanceof Laptop){
                System.out.println(p);
            }
        }
    }

    public void getElectronicsProducts(){
        for(Product p: productList){
            if(p.catg.equals("electronics")){
                System.out.println(p);
            }
        }
    }

    public void getAllProductsOnCategory(){
        Scanner input = new Scanner(System.in);
        System.out.print("Which category of product you want to show: ");
        String ucatg = input.nextLine();
        for(Product p: productList){
            if(p.catg.equalsIgnoreCase(ucatg)){
                System.out.println(p);
            }
        }
    }


    public void getProductCountOncategory() {
        Map<String, Double> m1=new HashMap<>();
        for(Product p:productList) {
            if(m1.containsKey(p.catg))
                m1.put(p.catg, m1.get(p.catg)+1);
            else
                m1.put(p.catg, 1.0);
        }
        System.out.println(m1);
    }

    public void getAllcategory() {
        Set<String> s1=new TreeSet<>();
        for(Product p:productList) {
            s1.add(p.catg);
        }
        System.out.println(s1);
    }

    public void getProductType() {
        Set<String> s1=new HashSet<>();
        for(Product p:productList) {
            if(p instanceof Shirt)
                s1.add("Shirt");
            else if(p instanceof Mobile)
                s1.add("mobile");
        }
        System.out.println(s1);
    }

    public void removeProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to remove on brand");
        System.out.println("Press 2 to remove on category");
        Iterator<Product> itr = productList.iterator();

        int choice = input.nextInt();
        if(choice == 1) {
            System.out.println("Enter the brand");
            input.nextLine();
            String str = input.nextLine();
            while (itr.hasNext()){
                Product x = itr.next(); //storing the product on x and moving the cursor to forward
                if(x.brand.equalsIgnoreCase(str)){
                    itr.remove();
                }
            }

        } else  if (choice == 2){
            System.out.println("Enter the category: ");
            input.nextLine();
            String strr = input.nextLine();
            while (itr.hasNext()){ //it will give the next value
                Product x = itr.next(); //storing the product on x and moving the cursor to forward
                if(x.catg.equalsIgnoreCase(strr)){
                    itr.remove();
                }
            }
        }
    }
}