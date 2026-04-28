package test;

public class GenericExample4 {

    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency(new Home());

        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency(new Car2());
        Car2 car2 = carAgency.rent();
        car2.run();

    }

}
