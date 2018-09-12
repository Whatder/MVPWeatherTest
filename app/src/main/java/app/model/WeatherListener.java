package app.model;

import app.bean.WeatherBean;

/**
 * Created by Hexx on 2018/9/12 16:17
 * Desc：
 */
public interface WeatherListener {
    void onSucc(WeatherBean weatherBean);
}
