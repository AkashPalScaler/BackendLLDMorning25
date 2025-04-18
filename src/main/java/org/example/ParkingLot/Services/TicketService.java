package org.example.ParkingLot.Services;

import org.example.ParkingLot.Models.*;
import org.example.ParkingLot.Repositories.GateRepository;
import org.example.ParkingLot.Repositories.TicketRepository;
import org.example.ParkingLot.Repositories.VehicleRepository;
import org.example.ParkingLot.Strategies.SlotAllocationStrategy;
import org.example.ParkingLot.Strategies.SlotAllocationStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    public GateRepository gateRepository;
    public VehicleRepository vehicleRepository;
    public TicketRepository  ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Long gateId, String licenseNo, String ownerContact, String ownerName, VehicleType vehicleType){

        Ticket ticket = new Ticket(new Date());

        // Get the gate -> call repository
        Optional<Gate> optionalGate = gateRepository.getGateByID(gateId);
        Gate gate;
        // Add a gate to the ticket
        if(optionalGate.isPresent()){
            gate = optionalGate.get();
        }else{
            throw new RuntimeException("Gate not found");
        }
        ticket.setGate(gate);
        // Add the operator
        Operator operator = gate.getOperator();

        // Get/Save Vehicle
        Vehicle vehicle = vehicleRepository.findOrSaveVehicleByLicenseNumber(licenseNo, ownerContact, ownerName, vehicleType);
        // Add the vehicle
        ticket.setVehicle(vehicle);


        // Assign the parking slot -> parkingSlotAllotmentStrategy -> get this from parking lot
        ParkingLot parkingLot = gate.getParkingLot();
        SlotAllocationStrategy slotAllocationStrategy =
                SlotAllocationStrategyFactory.getStrategy(parkingLot.getSlotAllocationStrategyType());

        //Add the slot
        ticket.setParkingSlot(slotAllocationStrategy.allocateSlot(parkingLot, vehicle.getVehicleType()));

        // return the ticket
        return ticketRepository.save(ticket);
    }
}
