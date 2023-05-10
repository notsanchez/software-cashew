package com.cashew.cashew.Model;

import java.sql.Date;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class User {
    
    @Id
    @GeneratedValue
    private Long userID;

    @Nullable
    private long campusID;

    @Nullable
    private long universityID;

    @Nullable
    private long roleID;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private String telephone;
    private Date signupDate;
    private Date removeDate;
    private Date forgetDate;

    
    public Long getUserID() {
        return userID;
    }
    public void setUserID(Long userID) {
        this.userID = userID;
    }
    public long getCampusID() {
        return campusID;
    }
    public void setCampusID(long campusID) {
        this.campusID = campusID;
    }
    public long getUniversityID() {
        return universityID;
    }
    public void setUniversityID(long universityID) {
        this.universityID = universityID;
    }
    public long getRoleID() {
        return roleID;
    }
    public void setRoleID(long roleID) {
        this.roleID = roleID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Date getSignupDate() {
        return signupDate;
    }
    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }
    public Date getRemoveDate() {
        return removeDate;
    }
    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }
    public Date getForgetDate() {
        return forgetDate;
    }
    public void setForgetDate(Date forgetDate) {
        this.forgetDate = forgetDate;
    }

    
}
