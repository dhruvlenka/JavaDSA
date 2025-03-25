package CollectionFramework.ProjectProduct;

public class Driver3 {
    public static void main(String[] args) {
        ProductService services = new ProductService();
        services.addProduct(new Electronics("LG","LG3500A",25000,60.5,"White","Electronics","Refrigerator"));
        services.addProduct(new Electronics("Samsung","SAM56743",30000,60.5,"Grey","Electronics","Refrigerator"));
        services.addProduct(new Electronics("LG","LGA23",150000,139,"Black","Electronics","Tv"));
        services.addProduct(new Electronics("Croma","CR123",60000,55,"Black","Electronics","Tv"));
        services.addProduct(new Electronics("Bajaj","BA124",2400,0,"Blue and White","Electronics","Gliding Machine"));
        services.addProduct(new Electronics("Croma","CR4321",1299,0,"White and Black","Electronics","Gliding Machine"));
        services.addProduct(new Electronics("Pigeon","PG9871",1499,15,"Black","Electronics","Induction"));
        services.addProduct(new Electronics("Prestige","PR56565",2500,15,"Black","Electronics","Induction"));

        services.getAllProduct();

        services.removeProduct();
        System.out.println("---------Remaining Product----------");
        services.getAllProduct();



    }
}
