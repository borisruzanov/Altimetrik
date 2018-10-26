package com.example.boris.altimetrik.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeacherFFPromoCodeFund {

    @SerializedName("eligible")
    @Expose
    private String eligible;
    @SerializedName("deadline")
    @Expose
    private String deadline;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("matchingKey")
    @Expose
    private String matchingKey;
    @SerializedName("ownerRegion")
    @Expose
    private String ownerRegion;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("donorSalutation")
    @Expose
    private String donorSalutation;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("logoURL")
    @Expose
    private String logoURL;
    @SerializedName("description")
    @Expose
    private String description;

    public String getEligible() {
        return eligible;
    }

    public void setEligible(String eligible) {
        this.eligible = eligible;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMatchingKey() {
        return matchingKey;
    }

    public void setMatchingKey(String matchingKey) {
        this.matchingKey = matchingKey;
    }

    public String getOwnerRegion() {
        return ownerRegion;
    }

    public void setOwnerRegion(String ownerRegion) {
        this.ownerRegion = ownerRegion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDonorSalutation() {
        return donorSalutation;
    }

    public void setDonorSalutation(String donorSalutation) {
        this.donorSalutation = donorSalutation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
