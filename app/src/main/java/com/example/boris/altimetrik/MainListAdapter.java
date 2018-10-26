package com.example.boris.altimetrik;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.boris.altimetrik.Models.Proposal;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MainListAdapter  extends RecyclerView.Adapter<MainListAdapter.ListViewHolder> {

    /**
     * General
     */
    private List<Proposal> resultList;

    private ItemClickListener mClickListener;
    OnItemClickListener.OnItemClickCallback onItemClickCallback;

    public MainListAdapter(List<Proposal> resultList,  OnItemClickListener.OnItemClickCallback onItemClickCallback) {
        this.resultList = resultList;
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public MainListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_proposals, parent, false);
        return new ListViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull MainListAdapter.ListViewHolder holder, int position) {
        Proposal item = resultList.get(position);
        String title = item.getTitle();
        String descriprion = item.getShortDescription();
        holder.tvTitle.setText(title);
        holder.tvDescription.setText(descriprion + "...");
        Picasso.get()
                .load(item.getThumbImageURL())
                .into(holder.mImageBanner);
        holder.mImageBanner.setOnClickListener(new OnItemClickListener(position, onItemClickCallback));
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView mImageBanner;
        TextView tvTitle, tvDescription;

        public ListViewHolder(View itemView) {
            super(itemView);
            mImageBanner = (ImageView) itemView.findViewById(R.id.item_image);
            tvTitle = (TextView) itemView.findViewById(R.id.item_tv_title);
            tvDescription = (TextView) itemView.findViewById(R.id.item_tv_description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.v("Tag", "Item is clicked ");
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
