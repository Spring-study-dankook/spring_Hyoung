/*  모든 게시글에 대한 배열
    DB 연동시 삭제 가능 */

package com.dku.springstudy.vo;
public class AllBoards {
    public Board boards[];

    public AllBoards()
    {
        boards = new Board[3];

        boards[0] = new Board(1, "JAVA", "WTF");
        boards[1] = new Board(2, "KOTLIN", "TREND");
        boards[2] = new Board(3, "JAVASCRIPT", "SO HARD");
    }

}
