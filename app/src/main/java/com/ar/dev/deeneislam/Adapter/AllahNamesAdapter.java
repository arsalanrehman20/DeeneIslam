package com.ar.dev.deeneislam.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ar.dev.deeneislam.R;

public class AllahNamesAdapter extends RecyclerView.Adapter<AllahNamesAdapter.NamesViewHolder> {

    private Context context;
    private String[] names;
    private String[] desc;
    private int[] img;

    public AllahNamesAdapter(Context context, String[] names, String[] desc, int[] img) {
        this.context = context;
        this.names = names;
        this.desc = desc;
        this.img = img;
    }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_99_names, parent, false);

        return new NamesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        holder.tvName.setText(names[position]);
        holder.tvDesc.setText(desc[position]);
        holder.imageView.setImageResource(img[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class NamesViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView tvName, tvDesc;

        public NamesViewHolder(View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName_99_names);
            tvDesc=itemView.findViewById(R.id.tvDesc_99_names);
            imageView=itemView.findViewById(R.id.iv_99_names);
        }
    }
}
