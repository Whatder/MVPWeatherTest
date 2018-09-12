package app.presenter;

import app.bean.WeatherBean;
import app.model.IWeatherModel;
import app.model.WeatherListener;
import app.model.WeatherModelImpl;
import app.view.IMainView;

/**
 * Created by Hexx on 2018/9/12 16:10
 * Desc：
 */
public class WeatherPresenterImpl implements IWeatherPresenter, WeatherListener {
    IWeatherModel mModel;
    IMainView mView;

    public WeatherPresenterImpl(IMainView view) {
        mView = view;
        mModel = new WeatherModelImpl(this);
    }

    @Override
    public void getWeather() {
        mView.showLoading();
        mModel.getWeather();
    }

    @Override
    public void onSucc(WeatherBean weatherBean) {
        mView.hideLoading();
        mView.showWeather(weatherBean);
    }
}
