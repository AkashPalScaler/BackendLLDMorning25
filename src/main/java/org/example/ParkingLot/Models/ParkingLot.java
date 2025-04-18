package org.example.ParkingLot.Models;

import org.example.ParkingLot.Strategies.FeeCalculationStrategy;
import org.example.ParkingLot.Strategies.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseClass {
    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private SlotAllocationStrategyType slotAllocationStrategyType;

    public ParkingLot(String name) {
        this.name = name;
    }

    public SlotAllocationStrategyType getSlotAllocationStrategyType() {
        return slotAllocationStrategyType;
    }

    public void setSlotAllocationStrategyType(SlotAllocationStrategyType slotAllocationStrategyType) {
        this.slotAllocationStrategyType = slotAllocationStrategyType;
    }

    private FeeCalculationStrategy feeCalculationStrategy; // it should be type
    private List<SupportedVehicle> supportedVehicles;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public FeeCalculationStrategy getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    public List<SupportedVehicle> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<SupportedVehicle> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }
}
