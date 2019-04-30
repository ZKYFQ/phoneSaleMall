package cn.com.phone.pojo;

import java.util.Date;

public class ProviceInfo {
    private Integer proviceId;

    private String proviceName;

    private Date createDate;

    private Integer state;

    private String remarsk;

    public Integer getProviceId() {
        return proviceId;
    }

    public void setProviceId(Integer proviceId) {
        this.proviceId = proviceId;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName == null ? null : proviceName.trim();
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