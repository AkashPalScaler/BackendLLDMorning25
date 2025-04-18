package org.example.ParkingLot.Repositories;

import org.example.ParkingLot.Models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    Map<Long, Ticket> ticketStore = new TreeMap<>();
    public static Long previousId = 0L;

    public Ticket save(Ticket ticket){
        ticket.setId(previousId++);
        ticketStore.put(ticket.getId(), ticket);
        return ticket;
    }

}
