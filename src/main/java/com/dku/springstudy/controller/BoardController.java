package com.dku.springstudy.controller;

import com.dku.springstudy.service.BoardService;
import com.dku.springstudy.vo.Board;
import com.dku.springstudy.vo.BoardList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class BoardController
{
    @Autowired
    BoardService boardService;

    @GetMapping("/boards")
    public String Board(Model model) {

        model.addAttribute("boards",BoardList.boards);
        return "boardView/boards";
    }

    @GetMapping("/boards/getContents")
    public String GetContent(Model model, @RequestParam(required = false) String title)
    {
        Board board = boardService.findBoardByTitle(title);

        if(Objects.isNull(board)) {
            return "boardView/boardNotExist";
        }

        model.addAttribute("title", board.getTitle());
        model.addAttribute("content", board.getContent());

        return "boardView/correspondBoardView";
    }

    @PostMapping("/boards/modifyContents")
    public String ModifyContent(Model model, Board board) {

        Board targetBoard = boardService.findBoardByTitle(board.getTitle());

        if(Objects.isNull(targetBoard)) {
            return "boardView/boardNotExist";
        }
        targetBoard = boardService.modifyContents(board);

        model.addAttribute("title", targetBoard.getTitle());
        model.addAttribute("content", targetBoard.getContent());

        return "boardView/correspondBoardView";
    }

}
