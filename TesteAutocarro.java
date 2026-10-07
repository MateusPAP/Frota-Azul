public class TesteAutocarro
{
        public static void main(String[] args)
        {
            System.out.println("A classe teste autocarro está a funcionar");
            /** 
             * funcionalidade para testar o construtor da classe autocarro
             */
            
            // 1. Criar um objeto o tipo autocarro e lugar
            // Instanciar
            
            Autocarro autocarro = new Autocarro("xx-xx-xx", "#xxxx", 101, true, 101.00);
            
            // Testar contrutor
            String propsDoObjeto = autocarro.toString();
            System.out.println(propsDoObjeto);
            
            // Testar matricula com get e set     
            String mostraMatricula = autocarro.getMatricula();
            if(mostraMatricula != "22-xx-ge")
            {
                System.out.println("O teste getMatricula passou");
            }
            
            else
            {
                System.out.println("O teste getMatricula esta erradonão passou");
            }
            
            autocarro.setMatricula("md-33-cd");
            
            String m2 = autocarro.getMatricula();
            
            if(m2 != "md-33-cd")
            {
                System.out.println("O teste setMatricula funcionou");
            }
            
            else
            {
                System.out.println("O teste matricula setMatricula não funcionou");
            }
            
            // Testar cor com get e set
            String mostraCor = autocarro.getCor();
            if(mostraCor != "#xxxxx")
            {
                System.out.println("O teste getCor não corresponde");
            }
            
            else
            {
                System.out.println("O teste getCor corresponde");
            }
            
            autocarro.setCor("#yyyyyy");
            
            String cr2 = autocarro.getCor();
            
            if(cr2 != "#yyyyyy")
            {
                System.out.println("O teste setCor não corresponde");
            }
            
            else
            {
                System.out.println("O teste matricula setCor correspondente");
            }
            
            // Testar cor com get e set
            int mostraNumLugares = autocarro.getNumLugares();
            if(mostraNumLugares != 1)
            {
                System.out.println("O teste getNumLugares não corresponde");
            }
            
            else
            {
                System.out.println("O teste getNumLugares corresponde");
            }
            
            autocarro.setNumLugares(1);
            
            int nl2 = autocarro.getNumLugares();
            
            if(nl2 != 1)
            {
                System.out.println("O teste setNumLugares não corresponde");
            }
            
            else
            {
                System.out.println("O teste matricula setNumLugares correspondente");
            }
            
            // Testar se á ar condicionado com get e set
            boolean mostraArCondicionado = autocarro.getArCondicionado();
            if(mostraArCondicionado == true)
            {
                System.out.println("O teste getArCondicionado corresponde");
            }
            
            else
            {
                System.out.println("O teste getArCondicionado não corresponde");
            }
            
            autocarro.setArCondicionado(false);
            
            boolean ac2 = autocarro.getArCondicionado();
            
            if(ac2 == false)
            {
                System.out.println("O teste setArCondicionado corresponde");
            }
            
            else
            {
                System.out.println("O teste matricula setArCondicionado não correspondente");
            }
            
            // Testar os KMs com get e set
            double mostraKms = autocarro.getKms();
            if(mostraKms == 101.1)
            {
                System.out.println("O teste getKms corresponde");
            }
            
            else
            {
                System.out.println("O teste getKms não corresponde");
            }
            
            autocarro.setKms(102.5);
            
            double kms2 = autocarro.getKms();
            
            if(kms2 == 102.3)
            {
                System.out.println("O teste setKms corresponde");
            }
            
            else
            {
                System.out.println("O teste matricula setKms não correspondente");
            }
            
            String matricula = "uu-uu-uu";
            String corA10 = "Azulinho";
            
            int numLugaresValidar = 100;
            
            boolean acA10 = true;
            
            double kmsAvalidar = -2.5;
    
            
            boolean kmsValidados = Autocarro.validaKms(kmsAvalidar);
            boolean numLugaresValidados = Autocarro.validarNumLugares(numLugaresValidar);
            
            if(kmsValidados && numLugaresValidados)
            {
                Autocarro a10 = new Autocarro(matricula, corA10, numLugaresValidar, acA10, kmsAvalidar);
                System.out.println("D. Custódia autocarro criado com sucesso");
            }
            else
            {
                System.out.println("Dados inválidos, tente novamente");
            }
        }
}