import java.io.PrintWriter;

public class Smeker {
    private String ime;



    public Smeker(String text){
        this.ime = text;
    }

    public void resiSmeker(){
        for(int i =0;i<100;i++) {
            System.out.println(ime);
        }
    }
}
