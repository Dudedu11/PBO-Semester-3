public class GenericClass<T>{

    private T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }
    public static void main(String[] args) {
        GenericClass<String> Nama = new GenericClass<String>("John");

        GenericClass<Integer> Usia = new GenericClass<Integer>(20);

        String  nama = Nama.get();
        Integer usia = Usia.get();

        System.out.println("Nama  : " + nama);
        System.out.println("Usia  : " + usia);
    }

}