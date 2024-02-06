import java.util.ArrayList;

public class RepositorioCliente {
    private ArrayList<Cliente> clientes;

    public RepositorioCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void crearCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
        }
    }
}
