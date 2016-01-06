package com.wuge.duocat.model;

/**
 * Created by wuhao on 16/1/5.
 */

import java.io.Serializable;

public class Forum implements Serializable {
    private static final long serialVersionUID = 1L;
    private int nId;
    private String strName;
    private String strImgURL;
    private String strIntro;
    private int nNews;

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrImgURL() {
        return strImgURL;
    }

    public void setStrImgURL(String strImgURL) {
        this.strImgURL = strImgURL;
    }

    public String getStrIntro() {
        return strIntro;
    }

    public void setStrIntro(String strIntro) {
        this.strIntro = strIntro;
    }

    public int getnNews() {
        return nNews;
    }

    public void setnNews(int nNews) {
        this.nNews = nNews;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "nId=" + nId +
                ", strName='" + strName + '\'' +
                ", strImgURL='" + strImgURL + '\'' +
                ", strIntro='" + strIntro + '\'' +
                ", nNews=" + nNews +
                '}';
    }
}
