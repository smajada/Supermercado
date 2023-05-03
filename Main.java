import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cereales cereal = new Cereales("Kellogs", 2.50, "espelta");
        cereal.setCaducidad(LocalDate.now().minusWeeks(3));
        System.out.println(cereal);

        Detergente detergente = new Detergente("Lenor", 10.99);
        detergente.setDescuento(15);
        detergente.setTipoEnvase("plastico");
        detergente.setVolumen(33);
        System.out.println(detergente);

        Vino vinito = new Vino("El coto", "tinto", 12.5, 3.50);
        vinito.setCaducidad(LocalDate.now().plusYears(2));
        vinito.setDescuento(5);
        vinito.setTipoEnvase("botella");
        vinito.setVolumen(1);
        System.out.println(vinito);

        ArrayList<EsAlimento> lista = new ArrayList<EsAlimento>();
        lista.add(cereal);
        lista.add(vinito);

        int totalCalorias = 0;
        for (EsAlimento alimento : lista) {
            totalCalorias += alimento.getCalorias();
        }
        System.out.println("El numero total de calorias son: " + totalCalorias);

    }
}
