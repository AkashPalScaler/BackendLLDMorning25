package org.example.ParkingLot.Models;

import java.util.List;

public class ParkingSlot extends BaseClass{
    Integer slotNumber;
    ParkingSlotStatus parkingSlotStatus;
    SupportedVehicle supportedVehicle;

    public ParkingSlot(Integer slotNumber, ParkingSlotStatus parkingSlotStatus, SupportedVehicle supportedVehicle) {
        this.slotNumber = slotNumber;
        this.parkingSlotStatus = parkingSlotStatus;
        this.supportedVehicle = supportedVehicle;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public SupportedVehicle getSupportedVehicle() {
        return supportedVehicle;
    }

    public void setSupportedVehicle(SupportedVehicle supportedVehicle) {
        this.supportedVehicle = supportedVehicle;
    }
}
//ParkingSlot pObj;
//pObj.parkingFloor