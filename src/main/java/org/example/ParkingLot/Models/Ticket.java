package org.example.ParkingLot.Models;

import java.util.Date;

public class Ticket extends BaseClass{
    private Integer ticketNumber;
    private Date entryTime;
    private Gate gate;
    private Operator operator;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    private static int count = 0;

    public Ticket(Date entryTime) {
        this.ticketNumber = count++;
        this.entryTime = entryTime;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }
}
