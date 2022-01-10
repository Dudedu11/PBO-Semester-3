package John;

public class Wildcard <T>{

    private T Wildcard;

    public Wildcard(T Wildcard){
        this.Wildcard = Wildcard;
    }

    public T getWildcard(){
        return Wildcard;
    }

    public void setWildcard(T Wildcard){
        this.Wildcard = Wildcard;
    }
}
