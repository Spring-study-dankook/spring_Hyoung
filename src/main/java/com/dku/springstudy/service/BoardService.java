package com.dku.springstudy.service;

import com.dku.springstudy.vo.BoardList;
import com.dku.springstudy.vo.Board;
import com.dku.springstudy.vo.BoardType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    public Board findBoardByTitle(String title) {
        for (Board board : BoardList.boards) {
            if (board.getTitle().equals(title))
                return board;
        }
        return null;
    }
    public Board findBoardByTypeAndTitle(BoardType type,String title) {
        for (Board board : BoardList.boards) {
            if (board.getType().equals(type))
                if(board.getTitle().equals(title))
                    return board;
        }
        return null;
    }

    public List<Board> findBoardsByType(BoardType type) {

        List<Board> targetList = new ArrayList<>();

        for (Board board : BoardList.boards) {
            if (board.getType().equals(type))
                targetList.add(board);
        }
        return targetList;
    }

    public Board modifyContent(Board board) {
        Board targetBoard = findBoardByTitle(board.getTitle());

        if (targetBoard != null) {
            targetBoard.setContent(board.getContent());
        }
        return targetBoard;
    }
}
/*
    public List<Board> findBoardsByTitle(String title) {

        if(title.isEmpty())
            return null;

        List<Board> targetList = new ArrayList<>();

        for (Board board : BoardList.boards) {
            if (board.getTitle().equals(title))
                targetList.add(board);
        }
        return targetList;
    }
 */

