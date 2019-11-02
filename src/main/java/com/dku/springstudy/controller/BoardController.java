package com.dku.springstudy.controller;
import com.dku.springstudy.service.BoardService;
import com.dku.springstudy.vo.AllBoards;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {

    @GetMapping("/boards")
    public String Board(Model model, AllBoards boards) {

        model.addAttribute("title_1", boards.boards[0].getTitle());
        model.addAttribute("content_1", boards.boards[0].getContent());

        model.addAttribute("title_2", boards.boards[1].getTitle());
        model.addAttribute("content_2", boards.boards[1].getContent());

        model.addAttribute("title_3", boards.boards[2].getTitle());
        model.addAttribute("content_3", boards.boards[2].getContent());

        return "BoardView/Board";
    }

    @GetMapping("/boards/getContents")
    public String GetContent (Model model, AllBoards boards, BoardService boardService,
                     @RequestParam(value = "title" , required=false) String title)
    {
        int board_id = boardService.IsTitleExisted(boards, title);

        if(  board_id == 0 )
            return "BoardView/BoardNotExist";

        model.addAttribute("title", boards.boards[board_id-1].getTitle());
        model.addAttribute("content", boards.boards[board_id-1].getContent());

        return "BoardView/CorrespondBoardView";
    }

    @PostMapping("/boards/modifyContents")
    public String ModifyContent (Model model, AllBoards boards, BoardService boardService,
                         @RequestParam(value = "title" , required=false) String title,
                         @RequestParam(value = "content" , required=false) String content )
    {
        int board_id = boardService.IsTitleExisted(boards, title);

        if( board_id == 0 )
            return "BoardView/BoardNotExist";

        boardService.ModifyContents(boards, board_id, title, content);

        model.addAttribute("title", boards.boards[board_id-1].getTitle());
        model.addAttribute("content", boards.boards[board_id-1].getContent());

        return "BoardView/CorrespondBoardView";
    }

}
