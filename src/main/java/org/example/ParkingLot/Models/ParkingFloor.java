package org.example.ParkingLot.Models;

import java.util.List;
// PF 1:M PSLOT //
public class ParkingFloor extends BaseClass {
    Integer floorNumber;
    ParkingFloorStatus parkingFloorStatus;
    List<ParkingSlot> parkingSlots;
    private List<SupportedVehicle> supportedVehicles;
}
