package ec.edu.intsuperior.modelo;

public class Automovil {
    private String placa;
    public enum TipoMarca {CHEVROLET, TOYOTA, VMW, AUDI}
    private TipoMarca marca;
    private int anio;
    public enum tipoColor {ROJO, NEGRO, BLANCO, AZUL}
    private tipoColor color;

    public Automovil() {
    }

    public Automovil(String placa, TipoMarca marca, int anio, tipoColor color) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    //este es un metodo de instancia que voy a utilizar para 
    //asignar un numero de placa a un objeto que vaya a crear
    //es un metodo de retorno null por q es de tipo void
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //este es un metodo de instancia que voy a utilizar para
    //retornar el numero de placa de un determinaddo objeto q
    //vaya a crear es un metodo que retorna un String (placa)
    public String getPlaca() {
        return placa;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public void setMarca(TipoMarca marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public tipoColor getColor() {
        return color;
    }

    public TipoMarca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "los datos del vehiculo son:\n"
                + "Placa: "+getPlaca()+"\n"
                + "Marca: "+getMarca()+"\n"
                + "Año: " +getAnio();
                
                }
    
    
            
    
    
    
    
    
    
}
