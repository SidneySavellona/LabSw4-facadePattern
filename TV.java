public class TV implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Turn ON TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn OFF TV");

    }
}