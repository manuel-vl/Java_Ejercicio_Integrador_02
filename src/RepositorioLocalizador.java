import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioLocalizador {
    private HashMap<Integer, ArrayList<Localizador>> repositorio;

    public void crearReserva(Integer idClient, Localizador localizador){
        // Si no existe la key, creamos el campo
        if(!this.repositorio.containsKey(idClient)){
            this.repositorio.put(idClient, new ArrayList<>());
        }

        this.repositorio.get(idClient).add(localizador);
    }

    public ArrayList<Localizador> obtenerReservas(Integer idClient){
        return this.repositorio.getOrDefault(idClient, null);
    }


}
