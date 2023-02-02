package interfacePractice;

public class Benz implements CarCalculators {



    @Override
    public double speed(double distance, double time) {
        return distance/time;
    }
}

