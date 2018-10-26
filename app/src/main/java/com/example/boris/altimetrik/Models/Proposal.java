package com.example.boris.altimetrik.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.security.auth.Subject;

public class Proposal {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("proposalURL")
    @Expose
    private String proposalURL;
    @SerializedName("fundURL")
    @Expose
    private String fundURL;
    @SerializedName("imageURL")
    @Expose
    private String imageURL;
    @SerializedName("retinaImageURL")
    @Expose
    private String retinaImageURL;
    @SerializedName("thumbImageURL")
    @Expose
    private String thumbImageURL;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("fulfillmentTrailer")
    @Expose
    private String fulfillmentTrailer;
    @SerializedName("snippets")
    @Expose
    private List<Object> snippets = null;
    @SerializedName("percentFunded")
    @Expose
    private String percentFunded;
    @SerializedName("numDonors")
    @Expose
    private String numDonors;
    @SerializedName("costToComplete")
    @Expose
    private String costToComplete;
    @SerializedName("studentLed")
    @Expose
    private Boolean studentLed;
    @SerializedName("numStudents")
    @Expose
    private String numStudents;
    @SerializedName("professionalDevelopment")
    @Expose
    private Boolean professionalDevelopment;
    @SerializedName("matchingFund")
    @Expose
    private MatchingFund matchingFund;
    @SerializedName("teacherFFPromoCodeFund")
    @Expose
    private TeacherFFPromoCodeFund teacherFFPromoCodeFund;
    @SerializedName("totalPrice")
    @Expose
    private String totalPrice;
    @SerializedName("freeShipping")
    @Expose
    private String freeShipping;
    @SerializedName("teacherId")
    @Expose
    private String teacherId;
    @SerializedName("teacherName")
    @Expose
    private String teacherName;
    @SerializedName("gradeLevel")
    @Expose
    private GradeLevel gradeLevel;
    @SerializedName("povertyLevel")
    @Expose
    private String povertyLevel;
    @SerializedName("povertyType")
    @Expose
    private PovertyType povertyType;
    @SerializedName("teacherTypes")
    @Expose
    private List<TeacherType> teacherTypes = null;
    @SerializedName("schoolTypes")
    @Expose
    private List<SchoolType> schoolTypes = null;
    @SerializedName("schoolName")
    @Expose
    private String schoolName;
    @SerializedName("schoolUrl")
    @Expose
    private String schoolUrl;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("stateFullName")
    @Expose
    private String stateFullName;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zone")
    @Expose
    private Zone zone;
    @SerializedName("subject")
    @Expose
    private Subject subject;
    @SerializedName("additionalSubjects")
    @Expose
    private List<AdditionalSubject> additionalSubjects = null;
    @SerializedName("resource")
    @Expose
    private Resource resource;
    @SerializedName("expirationDate")
    @Expose
    private String expirationDate;
    @SerializedName("fundingStatus")
    @Expose
    private String fundingStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProposalURL() {
        return proposalURL;
    }

    public void setProposalURL(String proposalURL) {
        this.proposalURL = proposalURL;
    }

    public String getFundURL() {
        return fundURL;
    }

    public void setFundURL(String fundURL) {
        this.fundURL = fundURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getRetinaImageURL() {
        return retinaImageURL;
    }

    public void setRetinaImageURL(String retinaImageURL) {
        this.retinaImageURL = retinaImageURL;
    }

    public String getThumbImageURL() {
        return thumbImageURL;
    }

    public void setThumbImageURL(String thumbImageURL) {
        this.thumbImageURL = thumbImageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFulfillmentTrailer() {
        return fulfillmentTrailer;
    }

    public void setFulfillmentTrailer(String fulfillmentTrailer) {
        this.fulfillmentTrailer = fulfillmentTrailer;
    }

    public List<Object> getSnippets() {
        return snippets;
    }

    public void setSnippets(List<Object> snippets) {
        this.snippets = snippets;
    }

    public String getPercentFunded() {
        return percentFunded;
    }

    public void setPercentFunded(String percentFunded) {
        this.percentFunded = percentFunded;
    }

    public String getNumDonors() {
        return numDonors;
    }

    public void setNumDonors(String numDonors) {
        this.numDonors = numDonors;
    }

    public String getCostToComplete() {
        return costToComplete;
    }

    public void setCostToComplete(String costToComplete) {
        this.costToComplete = costToComplete;
    }

    public Boolean getStudentLed() {
        return studentLed;
    }

    public void setStudentLed(Boolean studentLed) {
        this.studentLed = studentLed;
    }

    public String getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(String numStudents) {
        this.numStudents = numStudents;
    }

    public Boolean getProfessionalDevelopment() {
        return professionalDevelopment;
    }

    public void setProfessionalDevelopment(Boolean professionalDevelopment) {
        this.professionalDevelopment = professionalDevelopment;
    }

    public MatchingFund getMatchingFund() {
        return matchingFund;
    }

    public void setMatchingFund(MatchingFund matchingFund) {
        this.matchingFund = matchingFund;
    }

    public TeacherFFPromoCodeFund getTeacherFFPromoCodeFund() {
        return teacherFFPromoCodeFund;
    }

    public void setTeacherFFPromoCodeFund(TeacherFFPromoCodeFund teacherFFPromoCodeFund) {
        this.teacherFFPromoCodeFund = teacherFFPromoCodeFund;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getPovertyLevel() {
        return povertyLevel;
    }

    public void setPovertyLevel(String povertyLevel) {
        this.povertyLevel = povertyLevel;
    }

    public PovertyType getPovertyType() {
        return povertyType;
    }

    public void setPovertyType(PovertyType povertyType) {
        this.povertyType = povertyType;
    }

    public List<TeacherType> getTeacherTypes() {
        return teacherTypes;
    }

    public void setTeacherTypes(List<TeacherType> teacherTypes) {
        this.teacherTypes = teacherTypes;
    }

    public List<SchoolType> getSchoolTypes() {
        return schoolTypes;
    }

    public void setSchoolTypes(List<SchoolType> schoolTypes) {
        this.schoolTypes = schoolTypes;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolUrl() {
        return schoolUrl;
    }

    public void setSchoolUrl(String schoolUrl) {
        this.schoolUrl = schoolUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateFullName() {
        return stateFullName;
    }

    public void setStateFullName(String stateFullName) {
        this.stateFullName = stateFullName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<AdditionalSubject> getAdditionalSubjects() {
        return additionalSubjects;
    }

    public void setAdditionalSubjects(List<AdditionalSubject> additionalSubjects) {
        this.additionalSubjects = additionalSubjects;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFundingStatus() {
        return fundingStatus;
    }

    public void setFundingStatus(String fundingStatus) {
        this.fundingStatus = fundingStatus;
    }

}
