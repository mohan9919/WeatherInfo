package Model;

/**
 * Created by rahma on 12/19/2016.
 */

public class Place {
    private float lon;
    private float lat;
    private long sunrise;
    private long sunset;
    private String country;
    private String city;
    private int lastUpdates;

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLastUpdates() {
        return lastUpdates;
    }

    public void setLastUpdates(int lastUpdates) {
        this.lastUpdates = lastUpdates;
    }
}
