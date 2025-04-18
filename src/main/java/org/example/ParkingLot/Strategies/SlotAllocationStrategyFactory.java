package org.example.ParkingLot.Strategies;

import org.example.ParkingLot.Models.SlotAllocationStrategyType;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getStrategy(SlotAllocationStrategyType slotAllocationStrategyType){
        if(slotAllocationStrategyType.equals(SlotAllocationStrategyType.RANDOM)){
            return new RandomAllocationStrategy();
        }
        else{
            throw new RuntimeException("Strategy type doesn't exist");
        }
    }
}
