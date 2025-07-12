public class CollegeStudent extends Student {
    private int year;     
    private String major;  

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); 
        this.year = year;
        this.major = major;
    }
    
    // Getters
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
