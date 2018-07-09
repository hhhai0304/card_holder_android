package com.h3solution.cardholder.model;

public class CardModel {
    private int logoId;
    private String title;
    private String detail;

    public CardModel(int logoId, String title, String detail) {
        this.logoId = logoId;
        this.title = title;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }
}