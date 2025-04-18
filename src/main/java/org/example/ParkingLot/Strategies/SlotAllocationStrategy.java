package org.example.ParkingLot.Strategies;

import org.example.ParkingLot.Models.ParkingLot;
import org.example.ParkingLot.Models.ParkingSlot;
import org.example.ParkingLot.Models.VehicleType;

public interface SlotAllocationStrategy {
    public ParkingSlot allocateSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
