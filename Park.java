import java.util.ArrayList;

public class Park
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String morada;
    private ArrayList<Lugar> parque;

    public Park()
    {
        
    }
    
    public void Park(String nome, String morada)
    {
        this.nome = nome;
        this.morada = morada;
        this.parque = new ArrayList<>();
    }
}