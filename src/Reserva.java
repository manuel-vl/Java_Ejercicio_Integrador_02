public class Reserva {
    private TipoReserva tipo;
    private Double precio;

    public Reserva(TipoReserva tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public TipoReserva getTipo() {
        return tipo;
    }

    public void setTipo(TipoReserva tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
