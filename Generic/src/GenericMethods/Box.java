package GenericMethods;

public class Box<T> {

    private T t;
    public T get() {return t;}
    public void set(T t) { this.t = t;}

    //이 메서드 안에서 U라는 타입 이름을 하나 쓰겠다.
    //U라는 임시 타입 하나 만들게
    //public [타입 아무거나] void print([그 타입] u)

    public <U> void print(U u){
        System.out.println(u);
    }
}
