package id.ac.umn.muhammadfahmi_00000042206_if570_el_uts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Debug;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.SoundsViewHolder> {

    private ArrayList<Sounds> soundsDataList;
    private Context context;

    public SoundsAdapter(ArrayList<Sounds> soundsDataList, Context context) {
        this.soundsDataList = soundsDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public SoundsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater infalter = LayoutInflater.from(context);
        View view = infalter.inflate(R.layout.sound_cards, parent, false);
        return new SoundsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundsViewHolder holder, int position) {

        holder.tvJudul.setText(soundsDataList.get(position).getJudul());
        holder.tvDeskripsi.setText(soundsDataList.get(position).getDeskripsi());

        holder.scLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SoundDetails.class);
                intent.putExtra("judul", soundsDataList.get(holder.getBindingAdapterPosition()).getJudul());
                intent.putExtra("deskripsi", soundsDataList.get(holder.getBindingAdapterPosition()).getDeskripsi());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return soundsDataList.size();
    }

    public class SoundsViewHolder extends RecyclerView.ViewHolder {

        private TextView tvJudul, tvDeskripsi;
        private LinearLayout scLayout;

        public SoundsViewHolder(@NonNull View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.judulCard);
            tvDeskripsi = itemView.findViewById(R.id.deskripsiCard);

            scLayout = itemView.findViewById(R.id.soundCardsLayout);
        }
    }
}
