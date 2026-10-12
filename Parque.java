import java.util.ArrayList;

public class Parque
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String morada;
    private ArrayList<Lugar> lugares;

    public Parque(){}
    
    public Parque(String nome, String morada, int numLugares)
    {
        this.nome = nome;
        this.morada = morada;
        
        this.lugares = new ArrayList(numLugares);
        
        for(int i = 0; i < numLugares; i++)
            {
                String numLugar = "L-" +1;
                
                Lugar lTemp = new Lugar(numLugar);
                
                this.lugares.add(lTemp);
            }
    }
    
    public ArrayList<Lugar> getLugares()
    {
        return this.lugares;
    }
    
    public int getTotalNumLugares()
    {
        return this.lugares.size();
    }
    
    public boolean adicionarLugares(int lugaresAd)
    {
        if(lugaresAd > 0)
        {
            int inicio = this.lugares.size() + 1;
            int terminar = this.lugares.size() + 1 + lugaresAd;
            
            for(int i = inicio; i < terminar; i++)
            {
                String numLugar = "L-" +1;
                
                Lugar lTemp = new Lugar(numLugar);
                
                this.lugares.add(lTemp);
            }
            
            return true;
        }
        
        return false;
    }
    
    public boolean estacionar(Autocarro a)
    {
        for(int i = 0; i < this.lugares.size(); i++)
        {
            if(! this.lugares.get(i).getIsOcupado())
            {
                this.lugares.get(i).EstacionarAutocarro(a);
                
                return true;
            }
        }
        
        return false;
    }
    
    public int lugaresAvailable()
    {
        int lugaresAv = 0;
        
        for(int i = 0; i < this.lugares.size(); i++)
        {
            if(!this.lugares.get(i).getIsOcupado())
            {
                this.lugares.get(i).getNumeroLugar();
                lugaresAv++;
            }
        }

        return lugaresAv;
    }
    
    public boolean retirarAutocarro(String matricula)
    {
        for(int i = 0; i < this.lugares.size(); i++)
        {
            if(matricula == this.lugares.get(i).getAutocarroEstacionado().getMatricula())
            {
                this.lugares.get(i).DestacionarAutocarro();
                
                return true;
            }
        }
    
        return false;
    }
    
    public String procurarLugarAutocarro(String matricula)
    {
        for(int i = 0; i < this.lugares.size(); i++)
        {
            if(matricula == this.lugares.get(i).getAutocarroEstacionado().getMatricula())
            {
                return this.lugares.get(i).getAutocarroEstacionado().toString();
            }
        }
    
        return "Tente novamente";
    }
}