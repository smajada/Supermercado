import java.time.LocalDate;

public class Vino implements ConDescuento, EsAlimento, EsLiquido {
    private String marca;
    private String tipoVino;
    private double gradosAlcohol;
    private double precio;
    private LocalDate fechaCaducidad;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Vino(String marca, String tipoVino, double gradosAlcohol, double precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getPrecio() {
        if (this.descuento > 0) {
            return getPrecioDescuento();
        } else {
            return precio;
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // EsAlimento

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    };

    @Override
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return (int) (this.gradosAlcohol * 10);
    }

    // EsLiquido

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
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    // ConDescuento
    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio / (descuento * 100));
    }

    @Override
    public String toString() {
        return "Vino: {"
                + "\n Marca: " + marca
                + "\n Tipo de vino: " + tipoVino
                + "\n Grados de alcohol: " + gradosAlcohol
                + "\n Precio: " + precio + "€"
                + "\n Fecha de caducidad: " + fechaCaducidad
                + "\n Calorias: " + getCalorias() 
                + "\n Volumen: " + volumen
                + "\n Envase: " + tipoEnvase
                + "\n Descuento: " + descuento
                + "\n Precio con descuento: " + getPrecioDescuento()
                + "}";
    }
}
