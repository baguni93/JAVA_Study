package Synchronized;

public class User1Thread extends Thread{

    Calculator calculator;
    int memory;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User1Thread");
    }

    @Override
    public void run() {

        calculator.setMemory1(100);

    }


}
