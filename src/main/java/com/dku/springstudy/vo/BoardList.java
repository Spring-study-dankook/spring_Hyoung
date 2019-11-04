/*  모든 게시글에 대한 배열
    DB 연동시 삭제 가능하다고 판단
*/

package com.dku.springstudy.vo;
public class BoardList {
    public Board boards[];

    public BoardList()
    {
        boards = new Board[3];

        boards[0] = new Board("JAVA", "WTF");
        boards[1] = new Board("KOTLIN", "TREND");
        boards[2] = new Board("JAVASCRIPT", "SO HARD");
    }

}
