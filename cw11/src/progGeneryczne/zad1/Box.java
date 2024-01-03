package progGeneryczne.zad1;

public class Box<T>{
    private T element;

    public void setElement(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }
    public String toString(T element){
        return element.toString();
    }
    public Box(T element){
        this.element = element;
    }
    public Box(){}
}
