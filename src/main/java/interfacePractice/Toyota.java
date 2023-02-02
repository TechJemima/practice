package interfacePractice;

public class Toyota implements CarCalculators {


    @Override
    public double speed(double distance, double time) {
        return distance/time;
    }

    @Override
    public void distance(double speed, double time) {

    }
}
