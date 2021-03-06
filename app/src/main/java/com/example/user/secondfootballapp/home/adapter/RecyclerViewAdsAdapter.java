package com.example.user.secondfootballapp.home.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.user.secondfootballapp.PersonalActivity;
import com.example.user.secondfootballapp.R;
import com.example.user.secondfootballapp.home.activity.AdsPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecyclerViewAdsAdapter extends RecyclerView.Adapter<RecyclerViewAdsAdapter.ViewHolder> {

    AdsPage context;
    PersonalActivity activity;
    Logger log = LoggerFactory.getLogger(PersonalActivity.class);
    public RecyclerViewAdsAdapter(Activity activity, AdsPage context){
        this.activity = (PersonalActivity) activity;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ads, parent, false);
        RecyclerViewAdsAdapter.ViewHolder holder = new RecyclerViewAdsAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.textTitle.setText("В мире футбола чето там изменилось. Вау. Как неожиданно.");
//        holder.textDate.setText("27.01.18");
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textTitle;
        TextView textDate;
        public ViewHolder(View item) {
            super(item);
            textDate = (TextView) item.findViewById(R.id.adsDate);
            textTitle = (TextView) item.findViewById(R.id.adsTitle);
        }
    }
}
