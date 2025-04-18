package com.retail.walmart.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
public class BiddingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int biddingId;
    private final String projectName = "Metro Phase V 2024";
    private Double bidAmount;
    private Double yearsToComplete;
    private String dateOfBidding;
    private String status="pending";
    private int bidderId;
    public BiddingModel(){}

    public BiddingModel(int id,int biddingId, Double bidAmount, Double yearsToComplete, String dateOfBidding,String status, int bidderId) {
        this.id = id;
        this.biddingId = biddingId;
        this.bidAmount = bidAmount;
        this.yearsToComplete = yearsToComplete;
        this.dateOfBidding = dateOfBidding;
        this.status = status;
        this.bidderId = bidderId;
    }
    public BiddingModel(int id, Double bidAmount, Double yearsToComplete, String dateOfBidding, int bidderId, String status) {
        this.id = id;
        this.bidAmount = bidAmount;
        this.yearsToComplete = yearsToComplete;
        this.dateOfBidding = dateOfBidding;
        this.bidderId = bidderId;
        this.status = status;
    }
    public BiddingModel(String status){
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBiddingId() {
        return biddingId;
    }
    public void setBiddingId(int biddingId) {
        this.biddingId = biddingId;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setprojectName(String projectName) {
        this.projectName = projectName;
    }
    public Double getBidAmount() {
        return bidAmount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getBidderId() {
        return bidderId;
    }
    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }
    @Override
    public String toString() {
        return "BiddingModel{" +
                "id=" + id +
                ", biddingId=" + biddingId +
                ", projectName='" + projectName + '\'' +
                ", bidAmount=" + bidAmount +
                ", yearsToComplete=" + yearsToComplete +
                ", dateOfBidding='" + dateOfBidding + '\'' +
                ", status='" + status + '\'' +
                ", bidderId=" + bidderId +
                '}';
    }

}
