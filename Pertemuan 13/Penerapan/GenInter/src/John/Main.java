package John;

public class Main {
    public static void main(String args[]) {
        Integer inums[] = { 9, 1, 2, 8, 4 };
        Character chs[] = { 'r', 'i', 'j', 'd' };
        GenClass<Integer> a = new GenClass<Integer>(inums);
        GenClass<Character> b = new GenClass<Character>(chs);
        System.out.println(a.min());
        System.out.println(b.min());
    }
}