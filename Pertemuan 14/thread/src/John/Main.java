package John;

public class Main {
    public static void main (String [] args){
        System.out.println("=========================================");
        System.out.println("             Server Log");
        System.out.println("=========================================");
        for (int i = 0; i < 10; i++){
            Client class1 = new Client(i);
            Server class2 = new Server(i);
            Thread myThread = new Thread (class1);
            Thread myThread2 = new Thread (class2);
            myThread.start();
            myThread2.start();
        }
    }
}
