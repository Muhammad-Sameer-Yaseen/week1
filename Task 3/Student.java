public class Student {

    private String name;
    private String email;
    private double cgpa;

    public void setName(String name1) {
        name = name1;
    }

    public void setEmail(String email1) {
        email = email1;
    }

    public void setCgpa(double cgpa1) {
        cgpa = cgpa1;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCgpa() {
        return cgpa;
    }
 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("CGPA: " + cgpa);
    }
}
