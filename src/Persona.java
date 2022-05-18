public class Persona extends Thread{
    
    String nome;
    Semaforo semaforo;
    Spogliatoio spogliatoio;
    Pista pista;
    Semaforo sem2;

    public Persona(String nome,Semaforo semaforo,Spogliatoio spogliatoio,Pista pista,Semaforo sem2){

        this.nome=nome;
        this.semaforo=semaforo;
        this.spogliatoio=spogliatoio;
        this.pista=pista;
        this.sem2=sem2;
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
