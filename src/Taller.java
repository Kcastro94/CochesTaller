/**
 * Created by usu32 on 05/10/2016.
 */
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Taller {
    private Map<Persona, Coche> reparaciones =
            new TreeMap<>(Comparator.comparing(Persona::getNumeroSeguridadSocial));

    public void registrarReparacion(Persona persona, Coche coche){
        reparaciones.putIfAbsent(persona,coche);
    }

    public Coche obtenerCoche(Persona persona){
       return reparaciones.get(persona);

    }

    public Set<Persona> obtenerClientes(){
        return reparaciones.keySet();

    }
}

