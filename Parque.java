import java.util.ArrayList;
public class Parque
{
    private String nome;
    private String morada;
    private ArrayList<Lugar> lugares;
    private int numDeLugares;
    
    public Parque(){
    }
    
    public Parque(String nome, String morada, int numDeLugares){
        this.nome = nome;
        this.morada = morada;
        this.lugares = new ArrayList<>(numDeLugares);
        this.numDeLugares = numDeLugares;
        for(int i = 0; i < numDeLugares; i++) {
            int numLugar =  i;
            
            Lugar lTemp = new Lugar(getNumDeLugares());
            
            this.lugares.add(lTemp);
        }
    }
    
    public String getNome(){
        return this.nome;
    } 
    
    public String getMorada(){
        return morada;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMorada(String morada){
        this.morada = morada;
    }
    
    public int getNumDeLugares(){
        return numDeLugares;
    }
    
    public void setNumDelugares(int numDeLugares){
        this.numDeLugares = numDeLugares;
    }
    
    public ArrayList<Lugar> getLugares(){
        return lugares;
    }
    
    public void adicionarLugar(Lugar novoLugar){
        if(lugares.size() < numDeLugares){
            lugares.add(novoLugar);
        } else {
            System.out.println("O parque está cheio");
        }
    }
    

    public boolean estacionar(Autocarro a){
        for( Lugar lugar : lugares)
        {
            if(!lugar.getIsOcupado()){
                lugar.EstacionarAutocarro(a);

                return true;
            }
        }
        return false;
    }
    
    public int lugaresAvailable(){
        int lugaresAvailable = 0;
        for(Lugar lugar : this.lugares){
            if(!lugar.getIsOcupado()){
                lugaresAvailable += 1;
            }
        }

        return lugaresAvailable;
    }

    public boolean removerAutocarro (Autocarro removerA){
        for(Lugar lugar : this.lugares){
            if(lugar.getIsOcupado() && lugar.getAutocarroEstacionado().getMatricula() == removerA.getMatricula()){
                lugar.DestacionarAutocarro();
            }
            
            return true;
        }

        return false;
    }
    
    public void lugarDoAutocarro(Autocarro procurarA) {
        for(Lugar lugar : lugares)
            {
                if(lugar.getAutocarroEstacionado() == procurarA){
                 int numLugar = lugar.getNumeroLugar();
                
                 System.out.println("Lugar: " + numLugar);
                }
            }
        }
    }