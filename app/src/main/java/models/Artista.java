package models;

/**
 * Created by VanDeer on 08/12/2017.
 */

public class Artista {


    private int id;
    private String nome;
    private String description;
    private String musicStyle;
    private int artistCoverStyle;
    private boolean verified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public int getArtistCoverStyle() {
        return artistCoverStyle;
    }

    public void setArtistCoverStyle(int artistCoverStyle) {
        this.artistCoverStyle = artistCoverStyle;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Artista(int id, String nome, String description, String musicStyle, int artistCoverStyle, boolean verified) {
        this.id = id;
        this.nome = nome;
        this.description = description;
        this.musicStyle = musicStyle;
        this.artistCoverStyle = artistCoverStyle;
        this.verified = verified;
    }
}
