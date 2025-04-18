package org.example.ParkingLot.Strategies;

import org.example.ParkingLot.Models.*;

public class RandomAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public ParkingSlot allocateSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            if(floor.getParkingFloorStatus().equals(ParkingFloorStatus.FILLED)){
                continue;
            }
            for(ParkingSlot slot : floor.getParkingSlots()){
                if(slot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY) && slot.getSupportedVehicle().getVehicleType().equals(vehicleType)){
                    slot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
                    return slot;
                }
            }
        }
        throw  new RuntimeException("No slot left.Parking Slots are filled!");
    }
}
