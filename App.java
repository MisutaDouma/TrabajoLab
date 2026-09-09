import ar.edu.lab.domain.Auto;
import ar.edu.lab.domain.Cliente;
import ar.edu.lab.domain.Moto;
import ar.edu.lab.domain.Reserva;
import ar.edu.lab.domain.Vehiculo;
import ar.edu.lab.repositorio.Repositorio;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("=== SISTEMA DE RESERVAS DE VEHICULOS ===\n");

        Repositorio<Vehiculo> repoRodados = new Repositorio<>();

        Cliente c1 = new Cliente("Josema Gimenez", "30840235");

        Vehiculo a1 = new Auto("Ford", "Focus", 2000, 5);
        Vehiculo m1 = new Moto("Zanella", "RZ300", 1000, 300);

        repoRodados.agregar(a1);
        repoRodados.agregar(m1);

        Reserva reserva1 = new Reserva(c1, repoRodados, 2);

        reserva1.mostrarReserva();

    }
}