package models;

/**
 * Created by VanDeer on 08/12/2017.
 */

public class Album {


    private int id;
    private String name;
    private int artistId;
    private String relesaseDate;
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getRelesaseDate() {
        return relesaseDate;
    }

    public void setRelesaseDate(String relesaseDate) {
        this.relesaseDate = relesaseDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Album(int id, String name, int artistId, String relesaseDate, String price) {
        this.id = id;
        this.name = name;
        this.artistId = artistId;
        this.relesaseDate = relesaseDate;
        this.price = price;
    }
}
