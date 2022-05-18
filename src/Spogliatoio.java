public class Spogliatoio {
    
    public void cambiati(String nome){

        System.out.println(nome+ " è entrato nello spogliatoio");
        
        try {
            
            Thread.sleep((long)(Math.random()*1000));
        } catch (Exception e) {}
        
        System.out.println(nome + " è uscito dallo spogliatoio");
    }

}


