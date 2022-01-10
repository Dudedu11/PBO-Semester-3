package John;

public class Client implements Runnable{
    private int threadNumber;

    public Client(int num){
        this.threadNumber = num;
    }

    @Override
    public void run(){
        System.out.println("Receiving data from Client " + this.threadNumber );


    }
}