package CollectionFramework.ProjectProduct;

public class Driver4 {
    public static void main(String[] args) {
        ProductService services = new ProductService();
        services.addProduct(new Grocery("Oil","Grocery", "Fortune", 500.0, 90));
        services.addProduct(new Grocery("Oil","Grocery", "Dhara", 1000, 130));
        services.addProduct(new Grocery("Oil","Grocery", "Fortune", 1000, 150));
        services.addProduct(new Grocery("Oil","Grocery", "Patanjali", 500.0, 100));
        services.addProduct(new Grocery("Oil","Grocery", "Patanjali", 1000, 180));

        services.addProduct(new Grocery("Salt","Grocery", "TATA", 500, 14));
        services.addProduct(new Grocery("Salt","Grocery", "TATA", 1000, 28));

        services.addProduct(new Grocery("Turmeric Powder","Grocery", "Everest", 250, 150));
        services.addProduct(new Grocery("Turmeric Powder","Grocery", "Everest", 500, 300));

        services.addProduct(new Grocery("Red Chilli","Grocery", "Everest", 250, 200));
        services.addProduct(new Grocery("Red Chilli","Grocery", "Everest", 500, 400));

        services.addProduct(new Grocery("Coriander Powder","Grocery", "Everest", 250, 250));
        services.addProduct(new Grocery("Coriander Powder","Grocery", "Everest", 500, 500));

        services.addProduct(new Grocery("Rice","Grocery", "India Gate", 5, 300));
        services.addProduct(new Grocery("Rice","Grocery", "India Gate", 50, 3000));

        services.getAllProduct();

        services.removeProduct();
        System.out.println("------------------------------");
        services.getAllProduct();

    }
}
