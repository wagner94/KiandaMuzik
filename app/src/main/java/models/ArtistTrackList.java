package models;

import java.util.ArrayList;

/**
 * Created by VanDeer on 08/12/2017.
 */

public class ArtistTrackList {


    private int trackId;
    private int artistId;
    private ArrayList<Track> artistTracks;

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public ArrayList<Track> getArtistTracks() {
        return artistTracks;
    }

    public void setArtistTracks(ArrayList<Track> artistTracks) {
        this.artistTracks = artistTracks;
    }

    public ArtistTrackList(int trackId, int artistId, ArrayList<Track> artistTracks) {
        this.trackId = trackId;
        this.artistId = artistId;
        this.artistTracks = artistTracks;
    }
}
