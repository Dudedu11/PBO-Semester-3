package John;

public class Main {

    public static void main(String[] args) {
        printValue(new Wildcard<>("Nama : " + "John"));
        printValue(new Wildcard<>("Usia : "+ 20));

    }
    public static void printValue(Wildcard<?> Wildcard) {
        System.out.println(Wildcard.getWildcard());
    }
}
