package com.example.projectandroid.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "client",
        indices = {@Index(value = "identityCard", unique = true)}
)
public class Client {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idClient")
    private String id;

    private String fullName;
    private String identityCard;

    private String nation;
    private String address;
    private int phoneNumber;
    private int vip;
    private Date birthOfDate;
    private String email;

    public Client(String fullName, String identityCard, String nation, String address, int phoneNumber, int vip, Date birthOfDate, String email) {
        this.fullName = fullName;
        this.identityCard = identityCard;
        this.nation = nation;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.vip = vip;
        this.birthOfDate = birthOfDate;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public String getNation() {
        return nation;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getVip() {
        return vip;
    }

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public String getEmail() {
        return email;
    }
}
