package com.swagqueen.lulloo.newdesign.staticjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.swagqueen.lulloo.newdesign.R;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {
    private Context context;
    private List<Game> gameList;
    private View.OnClickListener onClickListener;
    private String type;

    public GameAdapter(Context context, List<Game> gameList) {
        this.context = context;
        this.gameList = gameList;
    }

    public void dataChanged(List<Game> gameList) {

        Log.e("keshav", "dataChanged -->" + gameList.size());

        this.gameList = gameList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GameHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(context).inflate(R.layout.student_list_tem, viewGroup, false);

        return new GameHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull GameHolder gameHolder, int pos) {
        Game gameInfo = gameList.get(pos);

        gameHolder.tv_name.setText("" + gameInfo.getName());
        gameHolder.tv_f_name.setText("" + gameInfo.getIconURL());
        gameHolder.tv_fees.setText("" + gameInfo.getLink());


    }

    @Override
    public int getItemCount() {
        return gameList == null ? 0 : gameList.size();
    }

    class GameHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_f_name;
        private TextView tv_fees;



        public GameHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_f_name = itemView.findViewById(R.id.tv_f_name);
            tv_fees = itemView.findViewById(R.id.tv_fees);
        }
    }
}