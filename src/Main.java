import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reserva reserva1= new Reserva(TipoReserva.COMIDA, 20.0),
                reserva2=new Reserva(TipoReserva.BOLETOS_VIAJE, 100.0),
                reserva3=new Reserva(TipoReserva.HOTEL, 40.0),
                reserva4=new Reserva(TipoReserva.TRANSPORTE, 50.0),
                reserva5=new Reserva(TipoReserva.HOTEL, 30.0)
        ;

        Cliente cliente1=new Cliente("Manuel", 155, 23);

        ArrayList<Reserva> reservas=new ArrayList<>(List.of(reserva1, reserva2, reserva3, reserva5));
        Localizador localizador=new Localizador(reservas, cliente1);

        System.out.println(localizador.getPrecioTotal());

    }
}
