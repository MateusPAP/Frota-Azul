import java.util.ArrayList;

public class TesteParque
{
    public static void main(String[] agrs) 
        {
       System.out.println("A classe TesteParque está a funcionar");
    
       Parque p1 = new Parque("Parque José Gonçalves", "Loures", 5);
       
       //1.Testar os sets e gets
       
       int numP = p1.getTotalNumLugares();
       
       if(numP == 5) {
                System.out.println("Esse é o total");
       } else {
                System.out.println("Deu errado");
       }
       
       ArrayList<Lugar> lugares = p1.getLugares();
       
       System.out.println(lugares);
       
       //2.Testar o metodo estacionarAutocarro
       
       Autocarro a1 = new Autocarro("xx-xx-xx", "#xxxx", 101, true, 101.00);
       
       p1.estacionar(a1);
       
       System.out.println(lugares);
       
       //3.Testar ometodo lugaresAvailable 
       
       int espacoLivre = p1.lugaresAvailable();
       System.out.println(espacoLivre);
       
       //4.Testar remover Autocarro
       
       p1.retirarAutocarro(a1.getMatricula());
       System.out.println(lugares);
       
       //5.Testar ver lugarAutocarro
       p1.estacionar(a1);
       Autocarro a2 = new Autocarro("11-11-11", "#0000", 101, true, 105.00);
       p1.estacionar(a2);
       p1.procurarLugarAutocarro(a2.getMatricula());
       System.out.println(lugares);
       
       
       
    }
}