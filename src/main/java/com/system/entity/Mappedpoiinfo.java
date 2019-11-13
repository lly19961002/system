package com.system.entity;

public class Mappedpoiinfo {
    private Integer placeid;

    private String longitude;

    private String latitude;

    private String city;

    private String roughfamily;

    private String thinfamily;

    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRoughfamily() {
        return roughfamily;
    }

    public void setRoughfamily(String roughfamily) {
        this.roughfamily = roughfamily == null ? null : roughfamily.trim();
    }

    public String getThinfamily() {
        return thinfamily;
    }

    public void setThinfamily(String thinfamily) {
        this.thinfamily = thinfamily == null ? null : thinfamily.trim();
    }
}