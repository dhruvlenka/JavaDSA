package CollectionFramework.ProjectProduct;

//adding fashion products and using some method specially made for fashion
public class Driver1 {
    public static void main(String[] args) {
        ProductService services = new ProductService();
        // (\t): for spaces
        services.addProduct(new Fashion("Male", "Calvin Klein\t", 10000,"Clothing","Jeans", 28, "Grey"));
        services.addProduct(new Fashion("Female", "H&M\t\t\t", 50000,"Clothing","Jeans", 26, "Grey"));
        services.addProduct(new Fashion("Boys", "Flying Machine", 45000,"Clothing","Shirt", 38, "White"));
        services.addProduct(new Fashion("Girls", "Zara\t\t\t", 10000,"Clothing","Shirt", 30, "Black"));
        services.addProduct(new Fashion("Male", "Max\t\t\t", 1499,"Clothing","Tshirt", 28, "Green"));
        services.addProduct(new Fashion("Female", "Trends\t\t", 2999,"Clothing","Hoodie", 26, "Pink"));
        services.addProduct(new Fashion("Boys", "Uniqlo\t\t", 2500,"Clothing","Hoodie", 38, "White"));
        services.addProduct(new Fashion("Girls", "US Polo\t\t", 1899,"Clothing","Sweatshirt", 30, "Pink"));

        services.getAllFashion();
        System.out.println("-----------------------------");
        services.getAllFashionBrands(); //issue in code
        services.getAllFashionsOnGender();
        services.getClothingCategory();



    }
}
