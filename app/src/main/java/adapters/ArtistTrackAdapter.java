package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vanklein.kiandamuzik.R;

import models.ArtistTrackList;



public class ArtistTrackAdapter extends RecyclerView.Adapter<ArtistTrackAdapter.ViewHolder> {

    private Context context;
    private ArtistTrackList trackList;

    public ArtistTrackAdapter(Context context, ArtistTrackList trackList){
        this.context = context;
        this.trackList = trackList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mTrackCover;
        public TextView mArtistName;
        public TextView mTrackName;
        public ImageView mArtistVerifiedBadge;
        public ImageView mTrackDetails;
        public ViewHolder(View itemView){
            super(itemView);
            //Criamos os itens do nosso list_item layout
            mTrackCover = itemView.findViewById(R.id.trackCover);
            mTrackDetails = itemView.findViewById(R.id.trackDetails);
            mTrackName = itemView.findViewById(R.id.trackName);
            mArtistVerifiedBadge = itemView.findViewById(R.id.verifiedAccount);
            mArtistName = itemView.findViewById(R.id.trackName);
        }
    }

//MetÛdos obrigatorios quando usamos o RecyclerView

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // instanciado outra classe neste caso list_item
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mArtistName.setText(trackList.getArtistTracks().get(position).getArtist().getNome());
        holder.mTrackName.setText(trackList.getArtistTracks().get(position).getaName());
        holder.mTrackCover.setImageResource(trackList.getArtistTracks().get(position).getTrackCover());
        if(trackList.getArtistTracks().get(position).getArtist().isVerified()){
            holder.mArtistVerifiedBadge.setImageResource(R.drawable.ic_verified_user_black_18dp);
        }else {
            //N„o apresentamos o bagde pois o artista n„o foi verificado
        }





    }

    @Override
    public int getItemCount() {
        return trackList.getArtistTracks().size();
    }
}

