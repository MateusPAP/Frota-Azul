public class TesteLugar
{
    public static void main(String[] args)
    {
        Lugar lugar = new Lugar("a1");
        
        String lugaresDisp = lugar.toString();
        System.out.println(lugaresDisp);
        
        // Testar matricula com get e set     
        String verLugar = lugar.getNumeroLugar();
        if(verLugar == "a1")
        {
            System.out.println("O lugar corresponde");
        }
        
        else
        {
            System.out.println("O não corresponde");
        }
        
        lugar.setNumeroLugar("a2");
        
        String m2 = lugar.getNumeroLugar();
        
        if(m2 == "a2")
        {
            System.out.println("O novo número corresponde");
        }
        
        else
        {
            System.out.println("O novo número não corresponde");
        }
    }
}