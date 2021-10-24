package id.ac.umn.uts_42306;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SFXAdapter extends RecyclerView.Adapter<SFXAdapter.SFXViewHolder> {

    Context context;
    ArrayList<SFX> sfxes;

    public SFXAdapter(Context context, ArrayList<SFX> sfxes) {
        this.context = context;
        this.sfxes = sfxes;
    }

    @NonNull
    @Override
    public SFXViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sfx_item, parent, false);

        return new SFXViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SFXViewHolder holder, int position) {
        holder.title.setText(sfxes.get(position).getTitle());
        holder.subTitle.setText(sfxes.get(position).getSubTitle());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail.class);

                intent.putExtra("title", sfxes.get(holder.getBindingAdapterPosition()).getTitle());
                intent.putExtra("subtitle", sfxes.get(holder.getBindingAdapterPosition()).getSubTitle());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sfxes != null ? sfxes.size():0;
    }

    public class SFXViewHolder extends RecyclerView.ViewHolder {

        TextView title, subTitle;
        LinearLayout linearLayout;
        public SFXViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title1);
            subTitle = itemView.findViewById(R.id.subTitle);
            linearLayout = itemView.findViewById(R.id.item);
        }
    }
}
