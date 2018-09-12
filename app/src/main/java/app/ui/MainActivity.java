package app.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hexx.mvpweatherapp.R;

import java.util.List;

import app.bean.WeatherBean;
import app.presenter.IWeatherPresenter;
import app.presenter.WeatherPresenterImpl;
import app.server.Weather;
import app.util.NetworkRequest;
import app.view.IMainView;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements IMainView {

    @BindView(R.id.tv)
    TextView mTv;
    @BindView(R.id.rv_weather)
    RecyclerView mRvWeather;
    private WeatherAdapter mAdapter;

    private IWeatherPresenter mPresenter;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mRvWeather.setLayoutManager(new LinearLayoutManager(this));
        mPresenter = new WeatherPresenterImpl(this);
        mPresenter.getWeather();
    }

    @Override
    public void showWeather(WeatherBean weatherBean) {
        mAdapter = new WeatherAdapter(weatherBean.getConsolidated_weather(), MainActivity.this);
        mRvWeather.setAdapter(mAdapter);
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "loading_start...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "loading_end...", Toast.LENGTH_SHORT).show();
    }
}
