package John;



public class Bounded {

    public static void main(String[] args) {
        BoundedTypeParameter<String> Nama = new BoundedTypeParameter<>("John");
        BoundedTypeParameter<Integer> Umur = new BoundedTypeParameter<>(20);

        String nama =Nama.getBTP();
        Integer umur = Umur.getBTP();
        System.out.println("Nama  : " + nama);
        System.out.println("Usia  : " + umur);

    }

}