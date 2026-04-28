package test;

public class HomeAgency implements Rentable{

    private Home home;

    public HomeAgency(Home home){
        this.home = home;
    }

    @Override
    public Home rent() {
        return home;
    }
}
