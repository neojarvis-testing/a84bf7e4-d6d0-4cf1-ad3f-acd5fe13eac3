public abstract class NFLPlayersReference {

    private static Runningback[] nflplayersreference;

    private static Quarterback[] players;

    private static WideReceiver[] nflplayers;

    public static void main(String args[]){

    Runningback r = new Runningback("Thomlinsion");

    Quarterback q = new Quarterback("Tom Brady");

    WideReceiver w = new WideReceiver("Steve Smith");

    NFLPlayersReference[] NFLPlayersReference;


        Run();// {

        NFLPlayersReference = new NFLPlayersReference [3];

        nflplayersreference[0] = r;

        players[1] = q;

        nflplayers[2] = w;
 

            for ( int i = 0; i < nflplayersreference.length; i++ ) {

            System.out.println("My name is " + " nflplayersreference[i].getName());

            nflplayersreference[i].run();

            nflplayersreference[i].run();

            nflplayersreference[i].run();

            System.out.println("NFL offensive threats have great running abilities!");

        }

    }

    private static void Run() {

        System.out.println("Not yet implemented");

    }     
 
}