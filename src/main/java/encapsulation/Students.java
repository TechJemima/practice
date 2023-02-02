package encapsulation;

public class Students {
    private String firstName;
    private String lastName;
    private int id;
    private int graduationYear;
    private String major;

    Students(String firstName, String lastName, int id, int graduationYear, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.graduationYear = graduationYear;
        this.major = major;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String getMajor() {
        return major;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void setMajor(String major) {
        this.major = major;
    }


//    public static void main(String[] args) {
//        Students students = new Students("Patricia", "Bright", 4589, 2023, "Accounting");
//
//        System.out.println(students.firstName);


    }


