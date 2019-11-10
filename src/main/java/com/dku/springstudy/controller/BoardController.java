package com.dku.springstudy.controller;

import com.dku.springstudy.service.BoardService;
import com.dku.springstudy.vo.Board;
import com.dku.springstudy.vo.BoardList;
import com.dku.springstudy.vo.BoardType;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/boards")
    public String Board(Model model) {

        model.addAttribute("boards", BoardList.boards);
        return "boardView/boards";
    }

    @GetMapping("/boards/type/{type}")
    public String getBoardsByType(Model model, @PathVariable(required = false) BoardType type) {
        List<Board> targetList = Lists.newArrayList(boardService.findBoardsByType(type));

        if (targetList.isEmpty())
            return "boardView/boardNotExist";

        model.addAttribute("boards", targetList);
        return "boardView/boards";
    }

    @GetMapping("/boards/title/{title}")
    public String getBoardByTitle(Model model, @PathVariable(required = false) String title) {

        Board board = boardService.findBoardByTitle(title);
        if (Objects.isNull(board)) {
            return "boardView/boardNotExist";
        }
        model.addAttribute("board", board);

        return "boardView/board";
    }

    @GetMapping("/boards/type/{type}/title/{title}")
    public String getBoardByTypeAndTitle(Model model,
                                         @PathVariable(required = false) BoardType type,
                                         @PathVariable(required = false) String title) {

        Board board = boardService.findBoardByTypeAndTitle(type, title);
        if (Objects.isNull(board)) {
            return "boardView/boardNotExist";
        }
        model.addAttribute("board", board);

        return "boardView/board";
    }

    @PostMapping("/boards/update")
    public String UpdateContent(Model model, Board board) {
        Board targetBoard = boardService.findBoardByTitle(board.getTitle());

        if (Objects.isNull(targetBoard)) {
            BoardList.boards.add(board);
            return "boardView/board";
        }

        targetBoard = boardService.modifyContent(board);
        model.addAttribute("board", targetBoard);
        return "boardView/board";
    }

}
