// 하나의 게시글에 대한 Class

package com.dku.springstudy.vo;

public class Board {

    private BoardType type;
    private String title;
    private String content;


    public Board(BoardType type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }


    public BoardType getType() {
        return type;
    }

    public void setType(BoardType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
