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
}