import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate fechaCaducidad;
    private int calorias;

    public Cereales (String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getTipoCereal(){
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal){
        this.tipoCereal = tipoCereal;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        String cereal = this.tipoCereal;

        switch(cereal) {
            case "espelta":
                calorias = 5;
                break;
            case "maiz":
                calorias = 8;
                break;
            case "trigo":
                calorias = 12;
                break;
            default:
                calorias = 15;
                break;
        }

        return calorias;
    }

    @Override
    public String toString(){
        return "Cereales {" + "Marca: " + marca
        + "\n Precio: " + precio + "€"
        + "\n Tipo de cereal: " + tipoCereal
        + "\n Fecha de caducidad: " + this.getCaducidad()
        + "\n Calorias: " + this.getCalorias() + "}";
    }

}
