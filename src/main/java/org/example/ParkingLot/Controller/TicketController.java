package org.example.ParkingLot.Controller;

import org.example.ParkingLot.DTOs.CreateTicketRequestDTO;
import org.example.ParkingLot.DTOs.CreateTicketResponseDTO;
import org.example.ParkingLot.Models.ResponseStatus;
import org.example.ParkingLot.Models.Ticket;
import org.example.ParkingLot.Models.Vehicle;
import org.example.ParkingLot.Services.TicketService;

public class TicketController {
    public  TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public CreateTicketResponseDTO createTicket(CreateTicketRequestDTO requestDTO){
        //Authenticate
        //Basic Validations -> Schema Validation
        CreateTicketResponseDTO createTicketResponseDTO = new CreateTicketResponseDTO();;
        try{
            Ticket ticket = ticketService.createTicket(
                    requestDTO.getGateId(),
                    requestDTO.getLicenseNumber(),
                    requestDTO.getOwnerContact(),
                    requestDTO.getOwnerName(),
                    requestDTO.getVehicleType()
            );

            createTicketResponseDTO.setTicket_id(ticket.getId());
            createTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            createTicketResponseDTO.setResponseMessage("Ticket generated!");

        }catch(Exception e){
            createTicketResponseDTO.setTicket_id(null);
            createTicketResponseDTO.setResponseStatus(ResponseStatus.ERROR);
            createTicketResponseDTO.setResponseMessage(e.getMessage());
        }
        return  createTicketResponseDTO;
    }
}

//TicketController (Requests, Response) -> Ticket Service
