package com.dku.springstudy.vo;

public class Board {
    private int bid;
    private String title;
    private String content;


    public Board(int bid, String title, String content) {
        this.bid = bid;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return bid;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setId(int bid) {
        this.bid = bid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
