package cn.com.phone.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;

    private String picFilePath;

    private String picNameType;

    private String brand;

    private BigDecimal price;

    private String productDesc;

    private Integer state;

    private Date createDate;

    private Date doneDate;

    private String remarsk;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
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

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public String getRemarsk() {
        return remarsk;
    }

    public void setRemarsk(String remarsk) {
        this.remarsk = remarsk == null ? null : remarsk.trim();
    }
}