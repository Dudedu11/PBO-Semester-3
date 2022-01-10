package John;

public class GenericsType<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("John"); //valid
        GenericsType type1 = new GenericsType(); //raw type
        type1.set(20); //valid and autoboxing support
        System.out.println("Nama  : " + type.get());
        System.out.println("Usia  : " + type1.get());
    }
}