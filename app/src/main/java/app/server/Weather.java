package app.server;

import java.util.List;

import app.bean.CityBean;
import app.bean.WeatherBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Hexx on 2018/9/11 17:36
 * Desc：
 */
public interface Weather {
    @GET("/api/location/search/")
    Observable<List<CityBean>> getCityID(@Query("query") String query);

    @GET("/api/location/{woeid}")
    Observable<WeatherBean> getWeatherByID(@Path("woeid") int woeid);
}
