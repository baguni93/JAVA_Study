package type;

public class Box<T>
{
    public T content;

    public boolean compare(Box<T> other){
        return content.equals(other.content);
    }

}
