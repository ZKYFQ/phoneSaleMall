package cn.com.phone.pojo;

import java.util.Date;

public class CityInfo {
    private Integer cityId;

    private Integer proviceId;

    private String cityName;

    private Date createDate;

    private Integer state;

    private String remarsk;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProviceId() {
        return proviceId;
    }

    public void setProviceId(Integer proviceId) {
        this.proviceId = proviceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemarsk() {
        return remarsk;
    }

    public void setRemarsk(String remarsk) {
        this.remarsk = remarsk == null ? null : remarsk.trim();
    }
}