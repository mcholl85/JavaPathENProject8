package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Location;

public class NearAttractionsDTO {
    private String attractionName;
    private Location attractionLocation;
    private Location userLocation;
    private double distance;
    private int rewardPoints;

    public NearAttractionsDTO(String attractionName, Location attractionLocation, Location userLocation, double distance, int rewardPoints) {
        this.attractionName = attractionName;
        this.attractionLocation = attractionLocation;
        this.userLocation = userLocation;
        this.distance = distance;
        this.rewardPoints = rewardPoints;
    }
    public String getAttractionName() {
        return attractionName;
    }
    public Location getAttractionLocation() {
        return attractionLocation;
    }
    public Location getUserLocation() {
        return userLocation;
    }
    public double getDistance() {
        return distance;
    }
    public int getRewardPoints() {
        return rewardPoints;
    }
    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }
    public void setAttractionLocation(Location attractionLocation) {
        this.attractionLocation = attractionLocation;
    }
    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
