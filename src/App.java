public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("inizio programma");

        Spogliatoio spogliatoio=new Spogliatoio();
        
        Semaforo semaforo =new Semaforo(2);
        Semaforo sem2=new Semaforo(4);

        Pista p=new Pista();

        Persona p1=new Persona("Paolo", semaforo, spogliatoio,p,sem2);
        Persona p2=new Persona("Ciccio", semaforo, spogliatoio,p,sem2);
        Persona p3=new Persona("Alessio", semaforo, spogliatoio,p,sem2);
        Persona p4=new Persona("Alessandro", semaforo, spogliatoio, p,sem2);
        Persona p5=new Persona("Tossa", semaforo, spogliatoio,p,sem2);
        Persona p6=new Persona("Bomba", semaforo, spogliatoio,p,sem2);
        Persona p7=new Persona("Mattia", semaforo, spogliatoio,p,sem2);
        Persona p8=new Persona("Davide", semaforo, spogliatoio, p,sem2);
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        p.classifica();

    }
}
