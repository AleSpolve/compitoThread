public class Persona extends Thread{
    
    String nome;
    Semaforo semaforo;
    Spogliatoio spogliatoio;
    Pista pista;
    

    public Persona(String nome,Semaforo semaforo,Spogliatoio spogliatoio,Pista pista){

        this.nome=nome;
        this.semaforo=semaforo;
        this.spogliatoio=spogliatoio;
        this.pista=pista;
        
    }

    public void run(){
        
        semaforo.P();
        spogliatoio.cambiati(nome);
        semaforo.V();

        pista.entraInPista(nome);

        semaforo.P();
        spogliatoio.cambiati(nome);
        semaforo.V();
    }

}
