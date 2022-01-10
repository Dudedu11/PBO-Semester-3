package John;

public class Server implements Runnable{
    private int threadNumber;

    public Server(int num){
        this.threadNumber = num;
    }

    @Override
    public void run(){
        System.out.println("Sending data to Client " + this.threadNumber );
    }
}
