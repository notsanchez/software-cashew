package com.cashew.cashew.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Cafeteria {
    
    @Id
    @GeneratedValue
    private Long cafeteriaID;
    private long campusID;
    private String name;
    private String photo;
    private String cpnj;
    private String description;
    private String telephone;
    private Number rating;
    private String publicKey;
    private String accessToken;

    
    public Long getCafeteriaID() {
        return cafeteriaID;
    }
    public void setCafeteriaID(Long cafeteriaID) {
        this.cafeteriaID = cafeteriaID;
    }
    public long getCampusID() {
        return campusID;
    }
    public void setCampusID(long campusID) {
        this.campusID = campusID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getCpnj() {
        return cpnj;
    }
    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Number getRating() {
        return rating;
    }
    public void setRating(Number rating) {
        this.rating = rating;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    
}
