public class Lugar
{
    private String numeroLugar;
    private boolean isOcupado;
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
    
    public Autocarro getAutocarroEstacionado()
    {
        return this.autocarroEstacionado;
    }
    
    public void EstacionarAutocarro(Autocarro autocarroEstacionado)
    {
        if(this.isOcupado == false)
        {
            this.autocarroEstacionado = autocarroEstacionado;
            isOcupado = true;
        }
    }
    
    public void DestacionarAutocarro()
    {
        if(this.isOcupado == true)
        {
            this.autocarroEstacionado = null;
            isOcupado = false;
        }
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