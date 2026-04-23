package custom;

public class InsufficientRuntimeException extends RuntimeException {

    //RuntimeException 런타임 예외는 컴파일러가 강제하지않는다.ㄴ
    public InsufficientRuntimeException() {}
    public InsufficientRuntimeException(String message) {
        super(message);
    }
}
