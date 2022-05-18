import java.util.ArrayList;
import java.util.Collections;

public class Pista{
    
    long start;
    long stop;
    long totale;
    ArrayList<Cronometro>listaRisultati;    
    Semaforo sem2;

    public Pista(Semaforo sem2){
        this.sem2=sem2;
        listaRisultati=new ArrayList();
    }

    public void entraInPista(String nome){

        sem2.P();

        Cronometro c;

        System.out.println(nome +" è entrato nella pista");
        start = System.nanoTime();
        
        for(int i=0;i<15;i++){
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (Exception e) {}
            
        }
        stop = System.nanoTime();
        totale=(stop-start) / 1000000;
        
        c=new Cronometro(totale,nome);

        listaRisultati.add(c);


        sem2.V();

        Collections.sort(listaRisultati);
        System.out.println(nome +" è uscito dalla pista");
    }   

    public void classifica(){

        int posto=1;

        for(int i=0;i<listaRisultati.size();i++){

            System.out.println("il " +posto +" è "+listaRisultati.get(i).getTempo()+" nome :" +listaRisultati.get(i).getNome());
            posto++;
        }

    }

}

