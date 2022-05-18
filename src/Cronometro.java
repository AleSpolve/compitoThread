public class Cronometro implements Comparable<Cronometro>{

    long tempo;
    String nome;

    public Cronometro(long t,String nome){

        tempo=t;
        this.nome=nome;
    }

    public long getTempo(){

        return tempo;
    }
    public String getNome(){

        return nome;
    }

    @Override
    public int compareTo(Cronometro o) {

        if(this.getTempo()<o.getTempo()){

            return -1;

        }
        if(this.getTempo()>o.getTempo()){

            return 1;
        }

        return 0;
    }
    
}
