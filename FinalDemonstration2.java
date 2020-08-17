public class FinalDemonstration2 {
    public static void main(String[] args)
    {

        String nf="no";
        Runnable thread=new Runnable() {
            @Override
            public void run() {
                System.out.println("not a final variable");
            }
        };
        Thread t=new Thread(thread);
        t.start();
        String f="final";
        Runnable t1=()->System.out.println("made non final as final");
        Thread tt1=new Thread(t1);
        tt1.start();
    }
    private static String s="instance variable";
    public void meth() {
        Fun f1 = () -> System.out.println("instance variable" + s);
    }
}

@FunctionalInterface
public interface Fun {
    void print();
}

