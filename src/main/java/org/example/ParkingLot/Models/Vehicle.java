package org.example.ParkingLot.Models;

public class Vehicle {
    String licenseNumber;
    String ownerPhone;
    String ownerName;
    VehicleType vehicleType;

    public Vehicle(String licenseNumber, String ownerPhone, String ownerName, VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.ownerPhone = ownerPhone;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
