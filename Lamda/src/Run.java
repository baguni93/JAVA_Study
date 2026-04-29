
public class Run {

    public static void main(String[] args) {


        Calculable cal1 = Computer::staticMethod;
        var result = cal1.calc(1,2);
        System.out.println(result);

        Person person = new Person();
        person.action(cal1);
    }
}
