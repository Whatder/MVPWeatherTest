package app.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hexx.mvpweatherapp.R;

import java.util.List;

import app.bean.WeatherBean;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Hexx on 2018/9/11 18:20
 * Desc：
 */
public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.Holder> {

    List<WeatherBean.ConsolidatedWeatherBean> mList;
    Context mContext;
    LayoutInflater mLayoutInflater;

    public WeatherAdapter(List<WeatherBean.ConsolidatedWeatherBean> list, Context context) {
        mList = list;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Holder(mLayoutInflater.inflate(R.layout.item_weather, null, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.mTvLine1.setText(String.valueOf(mList.get(i).getThe_temp()));
        holder.mTvLine2.setText(String.valueOf(mList.get(i).getMax_temp()));
        holder.mTvLine3.setText(String.valueOf(mList.get(i).getMin_temp()));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_line1)
        TextView mTvLine1;
        @BindView(R.id.tv_line2)
        TextView mTvLine2;
        @BindView(R.id.tv_line3)
        TextView mTvLine3;

        public Holder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
