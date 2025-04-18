package org.example.ParkingLot.Repositories;

import org.example.ParkingLot.Models.Gate;
import org.example.ParkingLot.Models.Vehicle;
import org.example.ParkingLot.Models.VehicleType;

import java.util.Map;
import java.util.TreeMap;

public class VehicleRepository {
    Map<String, Vehicle> vehicleStore = new TreeMap<>();

    public Vehicle save(Vehicle vehicle){
        // ORM -> To insert a record in the DB
        vehicleStore.put(vehicle.getLicenseNumber(), vehicle);
        return vehicleStore.get(vehicle.getLicenseNumber());
    }
    public Vehicle findOrSaveVehicleByLicenseNumber(String licenseNumber, String ownerContact, String ownerName, VehicleType vehicleType){
        if(vehicleStore.containsKey(licenseNumber)){
            return vehicleStore.get(licenseNumber);
        }
        Vehicle vehicle =  new Vehicle(licenseNumber, ownerContact, ownerName, vehicleType );

        return this.save(vehicle);
    }
}
