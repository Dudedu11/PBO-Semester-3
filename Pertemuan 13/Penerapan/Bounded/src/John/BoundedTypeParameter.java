package John;

public class BoundedTypeParameter<T> {
    private T BTP;

    public BoundedTypeParameter(T BTP){
        this.BTP = BTP;
    }

    public T getBTP(){
        return BTP;
    }

    public void setBTP(T BTP){
        this.BTP = BTP;
    }


}
