package org.example.ParkingLot.Models;

import java.util.List;
// PF 1:M PSLOT //
public class ParkingFloor extends BaseClass {
    Integer floorNumber;
    ParkingFloorStatus parkingFloorStatus;
    List<ParkingSlot> parkingSlots;
    private List<SupportedVehicle> supportedVehicles;

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<SupportedVehicle> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<SupportedVehicle> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }
}
