package com.institute.reputation.management.publisher.dao;

public class Address {

    private String houseNumber;

    private String streetName;

    private String localityName;

    private String city;

    private String district;

    private String state;

    private String pinCode;

    public Address(String houseNumber, String streetName, String localityName, String city, String district, String state, String pinCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.localityName = localityName;
        this.city = city;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
    }

    public Address(){

    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
