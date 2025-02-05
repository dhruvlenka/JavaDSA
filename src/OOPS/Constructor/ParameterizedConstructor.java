package OOPS.Constructor;

public class ParameterizedConstructor {
    String customerName;
    String email;
    long mobile;
    String state;
    String city;
    int pincode;

    ParameterizedConstructor(String customerName, String email, long mobile){
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
    }
    ParameterizedConstructor(String customerName, String email, long mobile, String state, String city, int pincode){
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public void setDetails(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Mobike: " + mobile);
        System.out.println("Customer State: " + state);
        System.out.println("Customer City:  " + city);
        System.out.println("Customer Address Pincode: " + pincode);
    }

    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor(
                "Rohan",
                "rohan@gmail.com",
                 9876543210L,
                "Phalna Thikana",
                 "Solar",
                111111
        );
        pc.setDetails();

        System.out.println();
        System.out.println(pc.customerName);
        System.out.println(pc.email);
        System.out.println(pc.mobile);
        System.out.println(pc.state);
        System.out.println(pc.city);
        System.out.println(pc.pincode);

        System.out.println();

        ParameterizedConstructor pc2 = new ParameterizedConstructor(
                "Rahul",
                "rahul@gmail.com",
                9876543210L);

        System.out.println(pc2.customerName);
        System.out.println(pc2.email);
        System.out.println(pc2.mobile);

    }
}
