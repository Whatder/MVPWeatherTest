package app.view;

import app.bean.WeatherBean;

/**
 * Created by Hexx on 2018/9/11 18:13
 * Desc：
 */
public interface IMainView {
    void showWeather(WeatherBean weatherBean);

    void showLoading();

    void hideLoading();
}
