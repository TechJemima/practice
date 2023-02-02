package interfacePractice;

public class Benz implements CarCalculators {



    @Override
    public double speed(double distance, double time) {
        return distance/time;
    }

    @Override
    public void distance(double speed, double time) {
        System.out.println(speed * time);
    }


}

