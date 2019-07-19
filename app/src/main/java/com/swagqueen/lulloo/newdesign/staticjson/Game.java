package com.swagqueen.lulloo.newdesign.staticjson;

import java.io.Serializable;

public class Game implements Serializable
{

    private Integer id;
    private String name;
    private String iconURL;
    private String link;
    private Boolean paid;
    private Object scrollBanner;
    private Integer entryFee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Object getScrollBanner() {
        return scrollBanner;
    }

    public void setScrollBanner(Object scrollBanner) {
        this.scrollBanner = scrollBanner;
    }

    public Integer getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(Integer entryFee) {
        this.entryFee = entryFee;
    }
}
