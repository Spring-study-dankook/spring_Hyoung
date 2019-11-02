/*  모든 게시글에 대한 배열
    DB 연동시 삭제 가능 */

package com.dku.springstudy.vo;
public class AllBoards {
    private Board boards[];

    public AllBoards()
    {
        boards[0] = new Board(1, "title_1",
                                "content_1 ");

        boards[1] = new Board(2, "title_2",
                                "content_2");

        boards[2] = new Board(3, "title_3",
                                "content_3");

    }
}
