package P105589.POO2122.POO2122;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventManager {
    private String nome;
    Set<Client> list = new HashSet<>();
    List<Event> lista = new ArrayList<>();

    public EventManager(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return this.nome;}
    public Client addClient(String nome, String localidade){
        Client x = new Client(nome, localidade);
        list.add(x);
        return x;
    }
    public Event addEvent(Client x, LocalDate date){
        Event y = new Event(x, date);
        lista.add(y);
        return y;
    }
    public Set<Client> listClients(){
        return list;
    }
    public List<Event> listEvents(){
        return lista;
    }
    @Override
    public String toString(){
        return this.nome;
    }
}
