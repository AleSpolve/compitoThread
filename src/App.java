public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("inizio programma");

        Spogliatoio spogliatoio=new Spogliatoio();
        
        Semaforo semaforo =new Semaforo(2);
        Semaforo sem2=new Semaforo(4);

        Pista p=new Pista(sem2);

        Persona p1=new Persona("Paolo", semaforo, spogliatoio,p);
        Persona p2=new Persona("Ciccio", semaforo, spogliatoio,p);
        Persona p3=new Persona("Alessio", semaforo, spogliatoio,p);
        Persona p4=new Persona("Alessandro", semaforo, spogliatoio, p);
        Persona p5=new Persona("Tossa", semaforo, spogliatoio,p);
        Persona p6=new Persona("Bomba", semaforo, spogliatoio,p);
        Persona p7=new Persona("Mattia", semaforo, spogliatoio,p);
        Persona p8=new Persona("Davide", semaforo, spogliatoio, p);
        
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
