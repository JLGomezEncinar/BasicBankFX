package com.iessanalberto.dam1.basicbankfx.repositories;

import com.iessanalberto.dam1.basicbankfx.models.Cliente;
import javafx.util.Pair;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class ClientRepository {
    private static ClientRepository clientRepository = null;

    private ClientRepository() {
        cargarClientes();
    }

    private Map<String, Cliente> mapaClientes = new HashMap<String, Cliente>();

    public static ClientRepository getInstance() {
        if (clientRepository == null) {
            clientRepository = new ClientRepository();
        }
        return clientRepository;
    }

    private void cargarClientes() {
        mapaClientes.put("21090405R", new Cliente("21090405R", "Paco", "Pérez Galdós", "1234", 1090));
        mapaClientes.put("21090406S", new Cliente("21090406S", "Ana", "García López", "5678", 2345));
        mapaClientes.put("21090407T", new Cliente("21090407T", "Luis", "Martínez Sánchez", "9101", 3456));
        mapaClientes.put("21090408U", new Cliente("21090408U", "María", "Rodríguez Fernández", "1122", 4567));
        mapaClientes.put("21090409V", new Cliente("21090409V", "Juan", "González Hernández", "3344", 5678));
        mapaClientes.put("21090410W", new Cliente("21090410W", "Laura", "Lopez Martínez", "5566", 6789));
        mapaClientes.put("21090411X", new Cliente("21090411X", "Carlos", "Sánchez Ruiz", "7788", 7890));
        mapaClientes.put("21090412Y", new Cliente("21090412Y", "Elena", "Ramírez Pérez", "9900", 8901));
        mapaClientes.put("21090413Z", new Cliente("21090413Z", "José", "Jiménez González", "2233", 9012));
        mapaClientes.put("21090414A", new Cliente("21090414A", "Marcos", "Fernández Sánchez", "4455", 1234));
        mapaClientes.put("21090415B", new Cliente("21090415B", "Isabel", "Martín Pérez", "6677", 2345));
        mapaClientes.put("21090416C", new Cliente("21090416C", "Antonio", "Hernández López", "8899", 3456));
        mapaClientes.put("21090417D", new Cliente("21090417D", "Raquel", "Díaz Rodríguez", "1010", 4567));
        mapaClientes.put("21090418E", new Cliente("21090418E", "Eduardo", "Gómez Sánchez", "1122", 5678));
        mapaClientes.put("21090419F", new Cliente("21090419F", "Carmen", "Morales Fernández", "2233", 6789));
        mapaClientes.put("21090420G", new Cliente("21090420G", "Javier", "Jiménez González", "3344", 7890));
        mapaClientes.put("21090421H", new Cliente("21090421H", "Verónica", "Sánchez Ruiz", "4455", 8901));
        mapaClientes.put("21090422I", new Cliente("21090422I", "Ricardo", "Vázquez Pérez", "5566", 1234));
        mapaClientes.put("21090423J", new Cliente("21090423J", "Sonia", "Hernández López", "6677", 2345));
        mapaClientes.put("21090424K", new Cliente("21090424K", "Ángel", "González Jiménez", "7788", 3456));
        mapaClientes.put("21090425L", new Cliente("21090425L", "Gloria", "Ramírez García", "8899", 4567));
        mapaClientes.put("21090426M", new Cliente("21090426M", "Pablo", "Lopez Sánchez", "9900", 5678));
        mapaClientes.put("21090427N", new Cliente("21090427N", "Marta", "Rodríguez Pérez", "2233", 6789));
        mapaClientes.put("21090428O", new Cliente("21090428O", "Fernando", "Martínez Fernández", "3344", 7890));
        mapaClientes.put("21090429P", new Cliente("21090429P", "Alicia", "Sánchez López", "4455", 8901));
        mapaClientes.put("21090430Q", new Cliente("21090430Q", "David", "González Ramírez", "5566", 1234));
        mapaClientes.put("21090431R", new Cliente("21090431R", "Beatriz", "Martín Rodríguez", "6677", 2345));
        mapaClientes.put("21090432S", new Cliente("21090432S", "Miguel", "Gómez Fernández", "7788", 3456));
        mapaClientes.put("21090433T", new Cliente("21090433T", "Laura", "Morales Sánchez", "8899", 4567));
        mapaClientes.put("21090434U", new Cliente("21090434U", "Ricardo", "Pérez Ramírez", "9900", 5678));
        mapaClientes.put("21090435V", new Cliente("21090435V", "Sara", "Jiménez Ruiz", "2233", 6789));
        mapaClientes.put("21090436W", new Cliente("21090436W", "Cristina", "Vázquez Hernández", "3344", 7890));
        mapaClientes.put("21090437X", new Cliente("21090437X", "José", "Sánchez Martínez", "4455", 8901));
        mapaClientes.put("21090438Y", new Cliente("21090438Y", "Luis", "Rodríguez González", "5566", 1234));
        mapaClientes.put("21090439Z", new Cliente("21090439Z", "Ana", "Hernández Pérez", "6677", 2345));
        mapaClientes.put("21090440A", new Cliente("21090440A", "Pedro", "Jiménez López", "7788", 3456));
        mapaClientes.put("21090441B", new Cliente("21090441B", "Celia", "Sánchez Ramírez", "8899", 4567));
        mapaClientes.put("21090442C", new Cliente("21090442C", "Javier", "Gómez Martínez", "9900", 5678));
        mapaClientes.put("21090443D", new Cliente("21090443D", "Patricia", "Vázquez López", "2233", 6789));
        mapaClientes.put("21090444E", new Cliente("21090444E", "Ricardo", "Martín Ramírez", "3344", 7890));
        mapaClientes.put("21090445F", new Cliente("21090445F", "Mónica", "Hernández Pérez", "4455", 8901));
        mapaClientes.put("21090446G", new Cliente("21090446G", "Pablo", "González Ramírez", "5566", 1234));
        mapaClientes.put("21090447H", new Cliente("21090447H", "Pedro", "Lopez Martínez", "6677", 2345));
        mapaClientes.put("21090448I", new Cliente("21090448I", "Natalia", "Jiménez Sánchez", "7788", 3456));
        mapaClientes.put("21090449J", new Cliente("21090449J", "David", "Rodríguez Hernández", "8899", 4567));
        mapaClientes.put("21090450K", new Cliente("21090450K", "Carlos", "Vázquez González", "9900", 5678));
    }

    public Pair<Boolean, Cliente> isLogged(String user, String password) {
        Pair<Boolean, Cliente> resultLogged = new Pair<>(false, null);
        if (mapaClientes.containsKey(user) && mapaClientes.get(user).getClave().equals(password)) {
            resultLogged = new Pair<>(true, mapaClientes.get(user));
        }


        return resultLogged;
    }
}
