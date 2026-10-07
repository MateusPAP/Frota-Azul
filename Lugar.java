public class Lugar
{
    private String numeroLugar;                 // a1
    private boolean isOcupado;                  // true
    private Autocarro autocarroEstacionado;  

    public Lugar()
    {
        
    }
    
    public Lugar(String numeroLugar)
    {
        this.numeroLugar = numeroLugar;
        this.isOcupado = false;
        this.autocarroEstacionado = null;
    }
    
    public String getNumeroLugar()
    {
        return this.numeroLugar;
    }
    
    public void setNumeroLugar(String nlr)
    {
        this.numeroLugar = nlr;
    }
    
    public boolean getIsOcupado()
    {
        return this.isOcupado;
    }
    
    public void setIsOcupado(boolean novoValor)
    {
        this.isOcupado = novoValor;
    }
    
    public Autocarro getAutocarroEstacionado()
    {
        return this.autocarroEstacionado;
    }
    
    public boolean EstacionarAutocarro(Autocarro autocarroEstacionado)
    {
        if(! this.isOcupado)
        {
            this.autocarroEstacionado = autocarroEstacionado;
            isOcupado = true;
            return true;
        }
        
        return false;
    }
    
    public boolean DestacionarAutocarro()
    {
        if(this.isOcupado)
        {
            this.autocarroEstacionado = null;
            isOcupado = false;
            return true;
        }
        
        return false;
    }
    
    public String toString ()
    {
        String resultado = "";
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("N.º do lugar: " + this.numeroLugar);
        sb.append("\nHá lugar: " + this.isOcupado);
        sb.append("\nTem vaga disponível: " + this.autocarroEstacionado);
        
        resultado = sb.toString();
        
        return resultado;
    }
}