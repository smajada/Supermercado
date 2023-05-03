public class Detergente implements ConDescuento, EsLiquido {
    private String marca;
    private double precio;
    private double descuento;
    private double volumen;
    private String envase;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }
    
    @Override
    public double getPrecioDescuento(){
        return precio - (precio / (descuento * 100.0));
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.envase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.envase;
    }

    @Override
    public String toString(){
        return 
        "Detergente {" +
        "\n Marca: " + this.marca + 
        "\n Precio: " + precio + "€" +
        "\n Descuento: " + descuento + 
        "\n Tipo de envase: " + envase +
        "\n Volumen: " + volumen +
        "\n Precio con descuento: " + getPrecioDescuento()
        + "}";
    }
}
