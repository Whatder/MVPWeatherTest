package app.bean;

import java.util.List;

/**
 * Created by Hexx on 2018/9/11 18:05
 * Desc：
 */
public class WeatherBean {

    /**
     * consolidated_weather : [{"id":6376651092918272,"weather_state_name":"Showers","weather_state_abbr":"s","wind_direction_compass":"S","created":"2018-09-11T08:58:17.217191Z","applicable_date":"2018-09-11","min_temp":18.5375,"max_temp":27.39,"the_temp":27.215,"wind_speed":5.479570134150561,"wind_direction":177.335261949223,"air_pressure":1009.5350000000001,"humidity":54,"visibility":13.300450369840132,"predictability":73},{"id":6312515017375744,"weather_state_name":"Heavy Cloud","weather_state_abbr":"hc","wind_direction_compass":"S","created":"2018-09-11T08:58:20.288000Z","applicable_date":"2018-09-12","min_temp":16.9675,"max_temp":28.71,"the_temp":25.53,"wind_speed":5.409437849584427,"wind_direction":187.3005116824942,"air_pressure":1009.76,"humidity":60,"visibility":12.672244094488189,"predictability":71},{"id":4583862646603776,"weather_state_name":"Heavy Cloud","weather_state_abbr":"hc","wind_direction_compass":"SSE","created":"2018-09-11T08:58:23.307983Z","applicable_date":"2018-09-13","min_temp":17.5875,"max_temp":29.2225,"the_temp":26.825000000000003,"wind_speed":3.505797674584427,"wind_direction":159.66711915757182,"air_pressure":1011.8399999999999,"humidity":59,"visibility":12.492978505527718,"predictability":71},{"id":6136083691601920,"weather_state_name":"Light Rain","weather_state_abbr":"lr","wind_direction_compass":"SE","created":"2018-09-11T08:58:26.304572Z","applicable_date":"2018-09-14","min_temp":18.96,"max_temp":26.5175,"the_temp":23.55,"wind_speed":3.901659749584427,"wind_direction":126.73441564446631,"air_pressure":1012.06,"humidity":71,"visibility":9.361267696651556,"predictability":75},{"id":4801759088214016,"weather_state_name":"Showers","weather_state_abbr":"s","wind_direction_compass":"N","created":"2018-09-11T08:58:30.388498Z","applicable_date":"2018-09-15","min_temp":15.532499999999999,"max_temp":24.9525,"the_temp":22.765,"wind_speed":6.36384744071224,"wind_direction":9.686830696379303,"air_pressure":997.15,"humidity":53,"visibility":11.598514674302077,"predictability":73},{"id":5650912240467968,"weather_state_name":"Heavy Cloud","weather_state_abbr":"hc","wind_direction_compass":"N","created":"2018-09-11T08:58:32.225487Z","applicable_date":"2018-09-16","min_temp":13.57,"max_temp":25.0975,"the_temp":22.03,"wind_speed":3.4910417826559557,"wind_direction":352.5321423431657,"air_pressure":978.4,"humidity":33,"visibility":9.997862483098704,"predictability":71}]
     * time : 2018-09-11T17:03:57.196881+08:00
     * sun_rise : 2018-09-11T05:52:06.884468+08:00
     * sun_set : 2018-09-11T18:30:32.044341+08:00
     * timezone_name : LMT
     * parent : {"title":"China","location_type":"Country","woeid":23424781,"latt_long":"36.894451,104.165649"}
     * sources : [{"title":"BBC","slug":"bbc","url":"http://www.bbc.co.uk/weather/","crawl_rate":180},{"title":"Forecast.io","slug":"forecast-io","url":"http://forecast.io/","crawl_rate":480},{"title":"HAMweather","slug":"hamweather","url":"http://www.hamweather.com/","crawl_rate":360},{"title":"Met Office","slug":"met-office","url":"http://www.metoffice.gov.uk/","crawl_rate":180},{"title":"OpenWeatherMap","slug":"openweathermap","url":"http://openweathermap.org/","crawl_rate":360},{"title":"Weather Underground","slug":"wunderground","url":"https://www.wunderground.com/?apiref=fc30dc3cd224e19b","crawl_rate":720},{"title":"World Weather Online","slug":"world-weather-online","url":"http://www.worldweatheronline.com/","crawl_rate":360},{"title":"Yahoo","slug":"yahoo","url":"http://weather.yahoo.com/","crawl_rate":180}]
     * title : Beijing
     * location_type : City
     * woeid : 2151330
     * latt_long : 39.906010,116.387909
     * timezone : Asia/Shanghai
     */

    private String time;
    private String sun_rise;
    private String sun_set;
    private String timezone_name;
    private ParentBean parent;
    private String title;
    private String location_type;
    private int woeid;
    private String latt_long;
    private String timezone;
    private List<ConsolidatedWeatherBean> consolidated_weather;
    private List<SourcesBean> sources;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSun_rise() {
        return sun_rise;
    }

    public void setSun_rise(String sun_rise) {
        this.sun_rise = sun_rise;
    }

    public String getSun_set() {
        return sun_set;
    }

    public void setSun_set(String sun_set) {
        this.sun_set = sun_set;
    }

    public String getTimezone_name() {
        return timezone_name;
    }

    public void setTimezone_name(String timezone_name) {
        this.timezone_name = timezone_name;
    }

    public ParentBean getParent() {
        return parent;
    }

    public void setParent(ParentBean parent) {
        this.parent = parent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public int getWoeid() {
        return woeid;
    }

    public void setWoeid(int woeid) {
        this.woeid = woeid;
    }

    public String getLatt_long() {
        return latt_long;
    }

    public void setLatt_long(String latt_long) {
        this.latt_long = latt_long;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<ConsolidatedWeatherBean> getConsolidated_weather() {
        return consolidated_weather;
    }

    public void setConsolidated_weather(List<ConsolidatedWeatherBean> consolidated_weather) {
        this.consolidated_weather = consolidated_weather;
    }

    public List<SourcesBean> getSources() {
        return sources;
    }

    public void setSources(List<SourcesBean> sources) {
        this.sources = sources;
    }

    public static class ParentBean {
        /**
         * title : China
         * location_type : Country
         * woeid : 23424781
         * latt_long : 36.894451,104.165649
         */

        private String title;
        private String location_type;
        private int woeid;
        private String latt_long;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLocation_type() {
            return location_type;
        }

        public void setLocation_type(String location_type) {
            this.location_type = location_type;
        }

        public int getWoeid() {
            return woeid;
        }

        public void setWoeid(int woeid) {
            this.woeid = woeid;
        }

        public String getLatt_long() {
            return latt_long;
        }

        public void setLatt_long(String latt_long) {
            this.latt_long = latt_long;
        }
    }

    public static class ConsolidatedWeatherBean {
        /**
         * id : 6376651092918272
         * weather_state_name : Showers
         * weather_state_abbr : s
         * wind_direction_compass : S
         * created : 2018-09-11T08:58:17.217191Z
         * applicable_date : 2018-09-11
         * min_temp : 18.5375
         * max_temp : 27.39
         * the_temp : 27.215
         * wind_speed : 5.479570134150561
         * wind_direction : 177.335261949223
         * air_pressure : 1009.5350000000001
         * humidity : 54
         * visibility : 13.300450369840132
         * predictability : 73
         */

        private long id;
        private String weather_state_name;
        private String weather_state_abbr;
        private String wind_direction_compass;
        private String created;
        private String applicable_date;
        private double min_temp;
        private double max_temp;
        private double the_temp;
        private double wind_speed;
        private double wind_direction;
        private double air_pressure;
        private int humidity;
        private double visibility;
        private int predictability;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getWeather_state_name() {
            return weather_state_name;
        }

        public void setWeather_state_name(String weather_state_name) {
            this.weather_state_name = weather_state_name;
        }

        public String getWeather_state_abbr() {
            return weather_state_abbr;
        }

        public void setWeather_state_abbr(String weather_state_abbr) {
            this.weather_state_abbr = weather_state_abbr;
        }

        public String getWind_direction_compass() {
            return wind_direction_compass;
        }

        public void setWind_direction_compass(String wind_direction_compass) {
            this.wind_direction_compass = wind_direction_compass;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getApplicable_date() {
            return applicable_date;
        }

        public void setApplicable_date(String applicable_date) {
            this.applicable_date = applicable_date;
        }

        public double getMin_temp() {
            return min_temp;
        }

        public void setMin_temp(double min_temp) {
            this.min_temp = min_temp;
        }

        public double getMax_temp() {
            return max_temp;
        }

        public void setMax_temp(double max_temp) {
            this.max_temp = max_temp;
        }

        public double getThe_temp() {
            return the_temp;
        }

        public void setThe_temp(double the_temp) {
            this.the_temp = the_temp;
        }

        public double getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(double wind_speed) {
            this.wind_speed = wind_speed;
        }

        public double getWind_direction() {
            return wind_direction;
        }

        public void setWind_direction(double wind_direction) {
            this.wind_direction = wind_direction;
        }

        public double getAir_pressure() {
            return air_pressure;
        }

        public void setAir_pressure(double air_pressure) {
            this.air_pressure = air_pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getVisibility() {
            return visibility;
        }

        public void setVisibility(double visibility) {
            this.visibility = visibility;
        }

        public int getPredictability() {
            return predictability;
        }

        public void setPredictability(int predictability) {
            this.predictability = predictability;
        }
    }

    public static class SourcesBean {
        /**
         * title : BBC
         * slug : bbc
         * url : http://www.bbc.co.uk/weather/
         * crawl_rate : 180
         */

        private String title;
        private String slug;
        private String url;
        private int crawl_rate;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getCrawl_rate() {
            return crawl_rate;
        }

        public void setCrawl_rate(int crawl_rate) {
            this.crawl_rate = crawl_rate;
        }
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "time='" + time + '\'' +
                ", sun_rise='" + sun_rise + '\'' +
                ", sun_set='" + sun_set + '\'' +
                ", timezone_name='" + timezone_name + '\'' +
                ", parent=" + parent +
                ", title='" + title + '\'' +
                ", location_type='" + location_type + '\'' +
                ", woeid=" + woeid +
                ", latt_long='" + latt_long + '\'' +
                ", timezone='" + timezone + '\'' +
                ", consolidated_weather=" + consolidated_weather +
                ", sources=" + sources +
                '}';
    }
}
