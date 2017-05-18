package tests.velka.rxjavatest.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Forest on 5/10/2017.
 */

public class Hostel {
    @SerializedName("name")
    private String name;
    @SerializedName("site")
    private String site;
    @SerializedName("id")
    private int id;
    @SerializedName("raiting")
    private double raiting;
    @SerializedName("description")
    private String description;

    public Hostel(String name, String site, int id, double raiting, String description) {
        this.name = name;
        this.site = site;
        this.id = id;
        this.raiting = raiting;
        this.description = description;
    }


    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public String getName() {

        return name;
    }

    public String getSite() {
        return site;
    }

    public int getId() {
        return id;
    }

    public double getRaiting() {
        return raiting;
    }

    public String getDescription() {
        return description;
    }
}
