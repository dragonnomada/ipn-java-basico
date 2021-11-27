package ipn.cic.ticketsproject;

import java.util.ArrayList;
import java.util.Date;

public abstract class TicketUtility {
    
    public abstract ArrayList<String> getTicketStoreIds(ArrayList<Ticket> tickets);
    
    public abstract ArrayList<Date> getTicketDatesGroupByDay(ArrayList<Ticket> tickets);
    
    public abstract ArrayList<Ticket> getTicketsByDay(ArrayList<Ticket> tickets);
    
}
