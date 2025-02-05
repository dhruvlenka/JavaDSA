package CollectionFramework.ProjectProduct;

//driver for mobile and laptop products
public class Driver2 {
    public static void main(String[] args) {
        ProductService services = new ProductService();
         services.addProduct(new Mobile("Apple", "iPhone 15","Pink",80000,
                      "Mobile", 16, 128, "3349mh","12MP",
                      "48MP", "A16 Bionic", "iOS", 6.1));
         services.addProduct(new Mobile("Apple", "iPhone 15 Pro","Natural Titanium",150000,
                "Mobile", 16, 256, "3349mh","12MP",
                "48+48+48 MP", "A17 Pro", "iOS", 6.1));
         services.addProduct(new Mobile("Samsung", "Samsung S23","Black",60000,
                "Mobile", 16, 128, "5000mh","12MP",
                "50MP", "Qualcomm SM8550-AC Snapdragon 8 Gen 2", "Android 13", 6.1));
         services.getAllMobiles();

         System.out.println("--------------------------------------");

         services.addProduct(new Laptop("Apple", "Macbook Pro 14inch", "Space Grey",
                 180000, "Laptop", 16, 512, "69.9 Watt", "M1 Pro",
                 "macOS", 14));
         services.getAllLaptops();

        System.out.println("--------------------------------------");

         //Removing Products
         services.removeProduct(); //working well
         System.out.println("=========Remaining products=========");
         services.getAllProduct();

    }
}
