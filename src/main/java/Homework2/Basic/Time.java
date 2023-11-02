package Homework2.Basic;

public class Time {
    public static void main(String[] args) {
        int kmHomeFromOffice = 2;
        double mediumSpeedTaxi = 65.5;

        double timeOfRide = kmHomeFromOffice / mediumSpeedTaxi;
        double coefficientOfEvening = 2;
        double timeOfRideEvening = timeOfRide * coefficientOfEvening;

        System.out.println(timeOfRide);
        System.out.println(timeOfRideEvening);
    }
}
