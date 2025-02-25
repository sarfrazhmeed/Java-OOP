
public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student(3.2,"Islamabad","838283284");
        Student s2=new Student(3.5,"Karachi", "3243223324");
	
	
       
       

        
        student1.setGPA(3.6);
        student1.setCITY("Lahore");
        student1.setPHONEno("0345622314");
	
	s2.setGPA(2.9);
	s2.setCITY("Islamabad");
        s2.setPHONEno("03466354344");
        System.out.printf("student details: are as follows:");
        student1.displayStudentData();
	s2.displayStudentData();
    }
}
