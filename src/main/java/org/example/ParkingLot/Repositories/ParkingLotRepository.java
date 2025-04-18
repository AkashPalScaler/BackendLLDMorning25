package org.example.ParkingLot.Repositories;

import org.example.ParkingLot.Models.Gate;
import org.example.ParkingLot.Models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotStore = new TreeMap<>();
    public  GateRepository gateRepository;

    public ParkingLot save(ParkingLot parkingLot){
        parkingLotStore.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }

    public ParkingLotRepository(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public ParkingLot getLotFromGateId(Long gateId){
        for(ParkingLot parkingLot: parkingLotStore.values()){
            for(Gate gate : parkingLot.getEntryGates()){
                if(gate.getId().equals(gateId)){
                    return parkingLot;
                }
            }
        }
        return null;
    }

    public ParkingLot getParkingLotFromGateId(Long gateId){
        Optional<Gate> optionalGate = gateRepository.getGateByID(gateId);
        if(optionalGate.isPresent()){
            return optionalGate.get().getParkingLot();
        }
        return null;
    }



}
