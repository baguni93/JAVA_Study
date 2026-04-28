package test;

public class CarAgency implements Rentable{

    private Car2 car2;
    public CarAgency(Car2 car2){
        this.car2 = car2;
    }

   @Override
    public Car2 rent() {
        return this.car2;
    }
}
