package class8;

public class Generic <T> {
    T obj;

    public Generic(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
}
