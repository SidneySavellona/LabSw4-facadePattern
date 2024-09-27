public class Light implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Turn ON Lights");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn OFF Lights");

    }
}