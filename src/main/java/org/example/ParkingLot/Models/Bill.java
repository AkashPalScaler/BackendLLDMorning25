package org.example.ParkingLot.Models;

import java.util.Date;
import java.util.List;

public class Bill {
    Integer billNumber;
    Date exitTime;
    Integer amount;
    List<Payment> payments;
    Gate gate;
    Operator operator;
    Ticket ticket;
}
