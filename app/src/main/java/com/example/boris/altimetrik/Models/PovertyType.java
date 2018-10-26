package com.example.boris.altimetrik.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PovertyType {
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("range")
    @Expose
    private String range;
    @SerializedName("showPovertyLevel")
    @Expose
    private String showPovertyLevel;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getShowPovertyLevel() {
        return showPovertyLevel;
    }

    public void setShowPovertyLevel(String showPovertyLevel) {
        this.showPovertyLevel = showPovertyLevel;
    }
}
