package org.example.ParkingLot.Models;

import org.example.ParkingLot.Strategies.FeeCalculationStrategy;
import org.example.ParkingLot.Strategies.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseClass {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private SlotAllocationStrategy slotAllocationStrategy;
    private FeeCalculationStrategy feeCalculationStrategy;
    private List<SupportedVehicle> supportedVehicles;
}
