public class HomeInterface{
    private HomeService light;
    private HomeService tv;
    private HomeService airconditioning;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new TV();
        this.airconditioning = new AirConditioning();
    }

    public void turnOnAll(){
        light.turnOn();
        tv.turnOn();
        airconditioning.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        airconditioning.turnOff();
    }
}