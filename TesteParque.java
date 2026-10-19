import java.util.ArrayList;

public class TesteParque
{   
    public static void main(String[] agrs) {
        
       Teste teste = new Teste(); 
        
       System.out.println("A classe TesteParque está a funcionar\n");
       String testeNome = "'Democracia' José Gonçalves";
       String testeMorada = "Loures"; 
       int numLugares = 3;

       //1.Testar construtor
       Parque p1 = new Parque(testeNome, testeMorada, numLugares);
       
       //2.Testar os metedos gets e sets
       String nomeP = p1.getNome();
       String nomeTeste1 = "Get nome";
       Teste.iniciarTeste(nomeTeste1);
       if(nomeP == testeNome ){
            Teste.mensagemDoValidarTeste(nomeTeste1, true);    
       } else{
           Teste.mensagemDoValidarTeste(nomeTeste1, false);
       }
       Teste.fimTeste(nomeTeste1);
       
       String nomeTeste2 = "Get morada";
       Teste.iniciarTeste(nomeTeste2);
       String moradaP = p1.getMorada();
       if(moradaP == testeMorada ){
            Teste.mensagemDoValidarTeste(nomeTeste2, true);    
       } else{
           Teste.mensagemDoValidarTeste(nomeTeste2, false);
       }
       Teste.fimTeste(nomeTeste2);
       
       String nomeTeste3 = "Get lugares";
       Teste.iniciarTeste(nomeTeste3);
       int lugaresP = p1.getNumDeLugares();
       if(lugaresP == numLugares ){
            Teste.mensagemDoValidarTeste(nomeTeste3, true);    
       } else{
           Teste.mensagemDoValidarTeste(nomeTeste3, false);
       }
       Teste.fimTeste(nomeTeste3);
       
       //3.Teste ao metodo estacionarAutocarro
       Autocarro a1 = new Autocarro("xx-xx-xx","azul",26,true,101.00);
       
       //Numeros de lugares disponiveis antes de estacionar
       int lugaresAntesDeEstacionar = p1.lugaresAvailable();
       p1.estacionar(a1);
       int lugaresDepoisDeEstacionar = p1.lugaresAvailable();
       String nomeTeste4 = "estacionar";
       Teste.iniciarTeste(nomeTeste4);

       if(lugaresAntesDeEstacionar > lugaresDepoisDeEstacionar){
           Teste.mensagemDoValidarTeste(nomeTeste4, true);    
       } else{
           Teste.mensagemDoValidarTeste(nomeTeste4, false);
       }
       Teste.fimTeste(nomeTeste4);    
       
       //4.Teste ao metodo removerAutocarro
       int lugaresAntesDeRemover = p1.lugaresAvailable();
       p1.removerAutocarro(a1);
       int lugaresDepoisDeRemover = p1.lugaresAvailable();
       String nomeTeste5 = "Remover autocarro";
       Teste.iniciarTeste(nomeTeste5);

       if(lugaresAntesDeRemover < lugaresDepoisDeRemover){
           Teste.mensagemDoValidarTeste(nomeTeste5, true);    
       } else{
           Teste.mensagemDoValidarTeste(nomeTeste5, false);
       }
       Teste.fimTeste(nomeTeste5);

    }
}