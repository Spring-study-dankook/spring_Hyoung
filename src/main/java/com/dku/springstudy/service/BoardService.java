package com.dku.springstudy.service;

import com.dku.springstudy.vo.BoardList;
import com.dku.springstudy.vo.Board;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public Board findBoardByTitle(String title) {
        for (Board board : BoardList.boards) {
            if (board.getTitle().equals(title))
                return board;
        }
        return null;
    }

    public Board modifyContents(Board board) {
        Board targetBoard = findBoardByTitle(board.getTitle());

        if(targetBoard != null) {
            targetBoard.setContent(board.getContent());
        }
        return targetBoard;
    }
}


