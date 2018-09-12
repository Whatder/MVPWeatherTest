package app.model;

import android.annotation.SuppressLint;

import app.bean.WeatherBean;
import app.server.Weather;
import app.util.NetworkRequest;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Hexx on 2018/9/12 16:11
 * Desc：
 */
public class WeatherModelImpl implements IWeatherModel {

    private WeatherListener mListener;

    public WeatherModelImpl(WeatherListener listener) {
        mListener = listener;
    }

    @SuppressLint("CheckResult")
    @Override
    public void getWeather() {
        NetworkRequest.init(Weather.class)
                .getWeatherByID(2151330)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<WeatherBean>() {
                    @Override
                    public void accept(WeatherBean weatherBean) throws Exception {
                        mListener.onSucc(weatherBean);
                    }
                });
    }
}
