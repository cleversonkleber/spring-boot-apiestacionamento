package com.api.parking_control.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;
    @Size(max = 7)
    @NotBlank
    private String licensePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String medelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;

    public ParkingSpotDto() {
    }

    public @NotBlank String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(@NotBlank String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public @Size(max = 7) @NotBlank String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(@Size(max = 7) @NotBlank String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public @NotBlank String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(@NotBlank String brandCar) {
        this.brandCar = brandCar;
    }

    public @NotBlank String getMedelCar() {
        return medelCar;
    }

    public void setMedelCar(@NotBlank String medelCar) {
        this.medelCar = medelCar;
    }

    public @NotBlank String getColorCar() {
        return colorCar;
    }

    public void setColorCar(@NotBlank String colorCar) {
        this.colorCar = colorCar;
    }

    public @NotBlank String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(@NotBlank String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public @NotBlank String getApartment() {
        return apartment;
    }

    public void setApartment(@NotBlank String apartment) {
        this.apartment = apartment;
    }

    public @NotBlank String getBlock() {
        return block;
    }

    public void setBlock(@NotBlank String block) {
        this.block = block;
    }
}
