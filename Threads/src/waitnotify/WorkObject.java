package waitnotify;

public class WorkObject {

    private boolean isAturn = true;

    public synchronized void methodA(){
        System.out.println("[" + Thread.currentThread().getName() + "] methodA 진입 시도");
        System.out.println("현재 isAturn = " + isAturn);

        while (!isAturn){

            try{
                System.out.println("[" + Thread.currentThread().getName() + "] 내 차례가 아니라 WAIT");
                wait();
                System.out.println("[" + Thread.currentThread().getName() + "] WAIT에서 깨어남");
            }
            catch (InterruptedException e){}

        }

        System.out.println(Thread.currentThread().getName() + ": methodA 작업");

        isAturn = false;
        System.out.println("[" + Thread.currentThread().getName() + "] 작업 끝 -> isAturn=false 로 변경 (B 차례)");

        notify();
        System.out.println("[" + Thread.currentThread().getName() + "] notify 호출");
        System.out.println("--------------------------------------");
    }

    public synchronized void methodB(){

        System.out.println("[" + Thread.currentThread().getName() + "] methodB 진입 시도");
        System.out.println("현재 isAturn = " + isAturn);


        while (isAturn){

            try{
                System.out.println("[" + Thread.currentThread().getName() + "] 내 차례가 아니라 WAIT");
                wait();
                System.out.println("[" + Thread.currentThread().getName() + "] WAIT에서 깨어남");
            }
            catch (InterruptedException e){}

        }

        System.out.println(Thread.currentThread().getName() + ": methodB 작업");

        isAturn = true;
        System.out.println("[" + Thread.currentThread().getName() + "] 작업 끝 -> isAturn=true 로 변경 (A 차례)");
        notify();
        System.out.println("[" + Thread.currentThread().getName() + "] notify호출");
        System.out.println("--------------------------------------");
    }
}
