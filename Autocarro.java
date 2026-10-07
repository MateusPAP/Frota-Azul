public class Autocarro
{
    static int MIN_LUGARES = 10;
    
    //Vars de Instância
    private String matricula;             // "xx-xx-xx || xxxxxx"
    private String cor;                  // "#xxxxxx"
    private int numLugares;              // true || false
    private boolean arCondicionado;     // 1
    private double kms;                 // 123.00
    
    public Autocarro()
    {
                   
    }
    
    public Autocarro(String matricula, String cor, int numLugares, boolean arCondicionado, double kms)
    {
        this.matricula = matricula;
        this.cor = cor;
        this.numLugares = numLugares;
        this.arCondicionado = arCondicionado;
        this.kms = kms;
    }
    
    public String getMatricula()
    {
        return this.matricula;
    }
    
    public void setMatricula(String m)
    {
        this.matricula = m;
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    public void setCor(String c)
    {
        this.cor = c;
    }
    
    public int getNumLugares()
    {
        return this.numLugares;
    }
    
    public void setNumLugares(int nl)
    {
        this.numLugares = nl;
    }
    
    public boolean getArCondicionado()
    {
        return this.arCondicionado;
    }
    
    public void setArCondicionado(boolean ac)
    {
        this.arCondicionado = ac;
    }
    
    public double getKms()
    {
        return this.kms;
    }
    
    public void setKms(double kmh)
    {
        this.kms = kmh;
    }
    
    public String toString ()
    {
        String resultadoT = "";
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Matrícula: " + this.matricula);
        sb.append("\ncor: " + this.cor);
        sb.append("\nNúmero lugares: " + this.numLugares);
        sb.append("\nAr condicionado: " + this.arCondicionado);
        sb.append("\nN.º Kms: " + this.kms);
        
        resultadoT = sb.toString();
        
        return resultadoT;
    }
    
    static boolean validaKms(double kmsAvalidar)
    {
        if(kmsAvalidar >= 1)
        {
            return true;
        }
        
        return false;
    }
    
    static boolean validarNumLugares(int lugaresValidar)
    {
        if(lugaresValidar >= MIN_LUGARES)
        {
            return true;
        }
        
        return false;
    }
}