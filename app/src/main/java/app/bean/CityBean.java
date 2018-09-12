package app.bean;

/**
 * Created by Hexx on 2018/9/11 17:41
 * Desc：
 */
public class CityBean {

    /**
     * title : Beijing
     * location_type : City
     * woeid : 2151330
     * latt_long : 39.906010,116.387909
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

    @Override
    public String toString() {
        return "CityBean{" +
                "title='" + title + '\'' +
                ", location_type='" + location_type + '\'' +
                ", woeid=" + woeid +
                ", latt_long='" + latt_long + '\'' +
                '}';
    }
}
