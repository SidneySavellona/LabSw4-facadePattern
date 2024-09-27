public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Turn ON AC");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn OFf AC");

    }
}