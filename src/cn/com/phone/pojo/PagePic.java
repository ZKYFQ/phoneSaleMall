package cn.com.phone.pojo;

import java.util.Date;

public class PagePic {
    private Integer picId;

    private String pageName;

    private String picFilePath;

    private String picNameType;

    private String pageLaction;

    private String desc;

    private Integer state;

    private Date createDate;

    private String remarsk;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public String getPicFilePath() {
        return picFilePath;
    }

    public void setPicFilePath(String picFilePath) {
        this.picFilePath = picFilePath == null ? null : picFilePath.trim();
    }

    public String getPicNameType() {
        return picNameType;
    }

    public void setPicNameType(String picNameType) {
        this.picNameType = picNameType == null ? null : picNameType.trim();
    }

    public String getPageLaction() {
        return pageLaction;
    }

    public void setPageLaction(String pageLaction) {
        this.pageLaction = pageLaction == null ? null : pageLaction.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemarsk() {
        return remarsk;
    }

    public void setRemarsk(String remarsk) {
        this.remarsk = remarsk == null ? null : remarsk.trim();
    }
}