package org.example.ParkingLot.Repositories;

import org.example.ParkingLot.Models.Gate;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    Map<Long, Gate> gateStore = new TreeMap<>();
    private static Long previousId = 0L;

    public Gate save(Gate gate){
        // ORM -> To insert a record in the DB
        gate.setId(previousId++);
        gateStore.put(gate.getId(), gate);
        return gate;
    }

    public Optional<Gate> getGateByID(Long gateId){
        // ORM -> To select gate where id = gateID
        if(gateStore.containsKey(gateId)){
            return Optional.of(gateStore.get(gateId));
        }
        return null;
    }

}

// DS which resembles DB the most
