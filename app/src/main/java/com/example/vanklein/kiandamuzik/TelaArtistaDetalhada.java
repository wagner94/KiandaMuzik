
package com.example.vanklein.kiandamuzik;

        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;
        import adapters.ArtistTrackAdapter;
        import models.Album;
        import models.ArtistTrackList;
        import models.Artista;
        import models.Track;


public class TelaArtistaDetalhada extends AppCompatActivity {

    RecyclerView listaDeMusicas;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDeMusicas = findViewById(R.id.listaDeMusicas);
//        setTitle("");
        Artista fs = new Artista( 1, "Vocal Livre", "descripton",
                "Gospel",  R.drawable.header,  true );
        Track track = new Track();
        Album alb = new Album( 1, "Bela Historia", fs.getId(),  "2016", "1500,00");
        track.setAlbum(alb);
        track.setArtist(fs);
        track.setTrackCover(R.drawable.vocal_livre2);
        track.setId(1);
        track.setaName("Vocal Livre");

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);
        ArtistTrackList fsTrackList = new ArtistTrackList(1, fs.getId(), tracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDeMusicas.setLayoutManager(linearLayoutManager);
        ArtistTrackAdapter adapter = new ArtistTrackAdapter(this, fsTrackList);
        listaDeMusicas.setAdapter(adapter);
    }
}

