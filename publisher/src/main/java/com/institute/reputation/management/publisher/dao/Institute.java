package com.institute.reputation.management.publisher.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Institute {
    @Id
    private String id;

    private String name;

    private String licenceNumber;

    private boolean govtRecognized;

    private Address address;

    private String foundedOn;

    public Institute(String id, String name, String licenceNumber, boolean govtRecognized, Address address, String foundedOn) {
        this.id = id;
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.govtRecognized = govtRecognized;
        this.address = address;
        this.foundedOn = foundedOn;
    }

    public Institute(String name, String licenceNumber, boolean govtRecognized, Address address, String foundedOn) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.govtRecognized = govtRecognized;
        this.address = address;
        this.foundedOn = foundedOn;
    }

    public Institute(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public boolean isGovtRecognized() {
        return govtRecognized;
    }

    public void setGovtRecognized(boolean govtRecognized) {
        this.govtRecognized = govtRecognized;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFoundedOn() {
        return foundedOn;
    }

    public void setFoundedOn(String foundedOn) {
        this.foundedOn = foundedOn;
    }
}
