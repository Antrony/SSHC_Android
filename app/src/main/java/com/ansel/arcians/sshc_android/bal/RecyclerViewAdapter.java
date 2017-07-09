package com.ansel.arcians.sshc_android.bal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ansel.arcians.sshc_android.R;
import com.ansel.arcians.sshc_android.bal.pojo.MultipleResource;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ZoneObject.Datum> zones;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ZoneObject.Datum> zones) {
        this.zones = zones;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.ZoneName.setText(zones.get(position).getName());
//        holder.ZonePhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.zones.size();
    }
}