package com.example.boris.altimetrik.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchingFund {
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
    @SerializedName("matchImpactMultiple")
    @Expose
    private String matchImpactMultiple;
    @SerializedName("multipleForDisplay")
    @Expose
    private String multipleForDisplay;
    @SerializedName("logoURL")
    @Expose
    private String logoURL;
    @SerializedName("faqURL")
    @Expose
    private String faqURL;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("description")
    @Expose
    private String description;

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

    public String getMatchImpactMultiple() {
        return matchImpactMultiple;
    }

    public void setMatchImpactMultiple(String matchImpactMultiple) {
        this.matchImpactMultiple = matchImpactMultiple;
    }

    public String getMultipleForDisplay() {
        return multipleForDisplay;
    }

    public void setMultipleForDisplay(String multipleForDisplay) {
        this.multipleForDisplay = multipleForDisplay;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getFaqURL() {
        return faqURL;
    }

    public void setFaqURL(String faqURL) {
        this.faqURL = faqURL;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
