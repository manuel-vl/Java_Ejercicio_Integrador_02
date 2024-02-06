import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Localizador {
    private ArrayList<Reserva> reservas;
    private Cliente cliente;
    private Double precioTotal;

    public Localizador(ArrayList<Reserva> reservas, Cliente cliente) {
        this.reservas = reservas;
        this.cliente = cliente;
        this.precioTotal=this.calcularPrecioTotal();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    protected double calcularPrecioTotal(){
        Set<TipoReserva> tiposReservas=new HashSet<>();

        double total=0;

        for (Reserva reserva: reservas){
            total+=reserva.getPrecio();
            tiposReservas.add(reserva.getTipo());
        }

        boolean existAll= tiposReservas.containsAll(EnumSet.allOf(TipoReserva.class));

        boolean descuentoHotelViaje=false;
        int contadorViaje=0;
        int contadorHotel=0;

        for(Reserva reserva:reservas){
            switch (reserva.getTipo()){
                case BOLETOS_VIAJE -> contadorViaje++;
                case HOTEL -> contadorHotel++;
                default -> {}
            }
        }

        if(contadorViaje==2 || contadorHotel==2){
            descuentoHotelViaje=true;
        }

        if(existAll){
            total=total*0.9;
        }

        if(descuentoHotelViaje){
            total=total*0.95;
        }

        return total;
    }
}
