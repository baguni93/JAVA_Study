package GenericMethods;

public class GenericExample {

    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {

        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("Hello");
        String stringValue = box2.get();
        System.out.println(stringValue);

        box1.print("test");
        box2.print(123);


    }

}
