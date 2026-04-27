package Synchronized;

public class User2Thread extends Thread{
    Calculator calculator;


    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User2Thread");
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }


}
