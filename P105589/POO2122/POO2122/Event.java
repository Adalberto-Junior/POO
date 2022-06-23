package P105589.POO2122.POO2122;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//import P105589.POO2122.POO2122.Client;
public class Event implements IEvent {
   private LocalDate date;
   private double totalprice = 0;
   private Client cliente;
   private List<Activity> list = new ArrayList<>();
   public Event(){}
   public Event(Client cliente, LocalDate date){
    this.date = date;
    this.cliente = cliente;
    //this.totalprice = totalPrice;

   }
   public Event addActivity (Activity atividade){
          list.add(atividade);
          this.totalprice += atividade.getPreco();
          Event x = new Event(this.cliente, this.date);
        return x;
   }
   public LocalDate getDate(){return this.date;}
   public double totalPrice(){
    return totalprice;
   }
   public Client getCliente(){return this.cliente;} 
   @Override
   public String toString(){
       return "Evento em " + this.date +  "," + "Total " +  this.totalprice + "euros";
   }
}
