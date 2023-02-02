package interfacePractice;

public class MainInheritance {

    public static void main(String[] args) {
        Benz benz = new Benz();

        System.out.println("the speed is = " + benz.speed(10,2.30));
        benz.distance(80,10);
        Toyota toyota = new Toyota();
        System.out.println(toyota.speed(50.00,4.00));


    }
}
