package cn.com.phone.pojo;

public class SeachWord {
    private Integer seachId;

    private String seachWord;

    private String brankFlag;

    public Integer getSeachId() {
        return seachId;
    }

    public void setSeachId(Integer seachId) {
        this.seachId = seachId;
    }

    public String getSeachWord() {
        return seachWord;
    }

    public void setSeachWord(String seachWord) {
        this.seachWord = seachWord == null ? null : seachWord.trim();
    }

    public String getBrankFlag() {
        return brankFlag;
    }

    public void setBrankFlag(String brankFlag) {
        this.brankFlag = brankFlag == null ? null : brankFlag.trim();
    }
}