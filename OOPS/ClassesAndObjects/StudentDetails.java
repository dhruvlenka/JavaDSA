package OOPS.ClassesAndObjects;

public class StudentDetails {
    //state or attribute
    String name;
    int admissionNumber;
    String dateOfBirth;
    String mothersName;
    String fathersName;
    long mobile;
    String address;
    String bloodGroup;

    //default constructor
    StudentDetails(){

    }

    //parameterized constructor
//    StudentDetails(String name, int admissionNumber, String dateOfBirth, String mothersName, String fathersName, long mobile, String address, String bloodGroup){
//        this.name = name;
//        this.admissionNumber = admissionNumber;
//        this.dateOfBirth = dateOfBirth;
//        this.mothersName = mothersName;
//        this.fathersName = fathersName;
//        this.mobile = mobile;
//        this.address = address;
//        this.bloodGroup = bloodGroup;
//    }

    public void setStudentDetails(String name, int admissionNumber, String dateOfBirth, String mothersName, String fathersName, long mobile, String address, String bloodGroup) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.dateOfBirth = dateOfBirth;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.mobile = mobile;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    public void getStudentDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Admission Number: " + admissionNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Mother's Name: " + mothersName);
        System.out.println("Father's Name: " + fathersName);
        System.out.println("Mobile: " + mobile);
        System.out.println("Address: " + address);
        System.out.println("Blood Group " + bloodGroup);
    }
    //setter
    public static void main(String[] args) {
        StudentDetails std = new StudentDetails();
        System.out.println(std.name);
        System.out.println(std.dateOfBirth);
        System.out.println(std.mothersName);
        System.out.println(std.fathersName);
        System.out.println(std.mobile);
        System.out.println(std.address);
        System.out.println(std.bloodGroup);

        System.out.println("===========================");

        StudentDetails std2 = new StudentDetails();
        std2.setStudentDetails("Arav", 1, "10-01-2015","Kumari",
                               "Kumar", 9191919199L, "UP", "O+");
        std2.getStudentDetails();
    }

}
