package encapsulation;

public class MainEncapsulation {

    public static void main(String[] args) {

            Students students = new Students("Patricia", "Bright", 4589, 2023, "Accounting");



        students.setFirstName("Chioma");
        students.setLastName("Obi");
        students.setId(5556);

        System.out.println(students.getFirstName());
        System.out.println(students.getLastName());
        System.out.println(students.getId());
        System.out.println(students.getGraduationYear());
        System.out.println(students.getMajor());

    }
}
