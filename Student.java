public class Student {
    private static int idCounter = 0; 
    private int studentId;
    private double gpa;
    private String city;
    private String phoneNo;

    
    Student(double gpa, String city, String phoneNo) {
        studentId = ++idCounter;
        this.gpa = gpa;   
        this.city = city;
        this.phoneNo = phoneNo;
    }

    
    public double getGPA() {
        return gpa;
    }

    public void setGPA(double newGpa) {
        gpa = newGpa; 
    }

    
    public String getCITY() {
        return city;
    }

    public void setCITY(String newCity) {
        city = newCity;
    }

    
    public String getPHONEno() {
        return phoneNo;
    }

    public void setPHONEno(String newPhoneNo) {
        phoneNo = newPhoneNo;
    }

    
    public void displayStudentData() {
        System.out.printf("\nFA24-BCS-%03d\n", studentId);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.printf("City: %s\n", city);
        System.out.printf("Phone No: %s\n", phoneNo);
    }
}
