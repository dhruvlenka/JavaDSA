public class MondayQ {
    public static void main(String[] args) {
        String firstName = "Dhruv";
        String lastName = "Dhurv";
        int pinCode = 462035;
        int nthDigit = 5;

        String small = "";
        String large = "";
        String result = "";

        if (firstName.length() < lastName.length()){
            large = lastName;
            small = firstName;
        } else if (firstName.length() > lastName.length()){
            large = firstName;
            small = lastName;
        } else {
            if (firstName.compareTo(lastName)>0){
                large = firstName;
                small = lastName;
            }
        }

        result = ("" + small.charAt(0)).toLowerCase()+large.toUpperCase();
        String newPin = String.valueOf(pinCode);
        result = result + newPin.charAt(nthDigit-1)+newPin.charAt(newPin.length()-nthDigit);
        System.out.println(result);

    }
}
