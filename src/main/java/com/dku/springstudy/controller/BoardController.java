package com.dku.springstudy.controller;

import com.dku.springstudy.service.BoardService;
import com.dku.springstudy.vo.Board;
import com.dku.springstudy.vo.BoardList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/boards")
    public String getBoards(Model model) {

        model.addAttribute("boards", BoardList.boards);

        /*model.addAttribute("title_1", BoardList.boards.get(0).getTitle());
        model.addAttribute("content_1", BoardList.boards.get(0).getContent());

        model.addAttribute("title_2", BoardList.boards.get(1).getTitle());
        model.addAttribute("content_2", BoardList.boards.get(1).getContent());

        model.addAttribute("title_3", BoardList.boards.get(2).getTitle());
        model.addAttribute("content_3", BoardList.boards.get(2).getContent());*/

        return "board";
    }

    @GetMapping("/boards/getContents")
    public String getContent(Model model, @RequestParam(required = false) String title) {
        Board board = boardService.findBoardByTitle(title);

        if (Objects.isNull(board)) {
            return "BoardView/BoardNotExist";
        }

        model.addAttribute("title", board.getTitle());
        model.addAttribute("content", board.getContent());

        return "BoardView/CorrespondBoardView";
    }

    @PostMapping("/boards/modifyContents")
    public String modifyContent(Model model, Board board) {
        Board targetBoard = boardService.findBoardByTitle(board.getTitle());

        if (targetBoard == null)
            return "BoardView/BoardNotExist";

        boardService.modifyContents(board);

        model.addAttribute("title", targetBoard.getTitle());
        model.addAttribute("content", targetBoard.getContent());

        return "BoardView/CorrespondBoardView";
    }

}
