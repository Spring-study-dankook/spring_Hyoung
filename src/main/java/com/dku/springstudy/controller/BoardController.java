package com.dku.springstudy.controller;
import com.dku.springstudy.service.BoardService;
import com.dku.springstudy.vo.BoardList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {

    // 모든 게시글 조회
    @GetMapping("/boards")
    public String Board(Model model, BoardList boards) {

        model.addAttribute("title_1", boards.boards[0].getTitle());
        model.addAttribute("content_1", boards.boards[0].getContent());

        model.addAttribute("title_2", boards.boards[1].getTitle());
        model.addAttribute("content_2", boards.boards[1].getContent());

        model.addAttribute("title_3", boards.boards[2].getTitle());
        model.addAttribute("content_3", boards.boards[2].getContent());

        return "BoardView/Board";
    }

    // 입력받은 제목에 해당하는 제목, 내용 조회
    @GetMapping("/boards/getContents")
    public String GetContent (Model model, BoardList boardList, BoardService boardService,
                              @RequestParam(value = "title" , required=false) String title)
    {
        int board_id = boardService.IsTitleExisted(boardList, title);

        if(  board_id == -1 )
            return "BoardView/BoardNotExist";

        model.addAttribute("title", boardList.boards[board_id].getTitle());
        model.addAttribute("content", boardList.boards[board_id].getContent());

        return "BoardView/CorrespondBoardView";
    }

    // 입력받은 제목에 해당하는 내용 수정 후 제목, 내용 조회
    @PostMapping("/boards/modifyContents")
    public String ModifyContent (Model model, BoardList boardList, BoardService boardService,
                                 @RequestParam(value = "title" , required=false) String title,
                                 @RequestParam(value = "content" , required=false) String content )
    {
        int board_id = boardService.IsTitleExisted(boardList, title);

        if( board_id == -1 )
            return "BoardView/BoardNotExist";

        boardService.ModifyContents(boardList, board_id, content);

        model.addAttribute("title", boardList.boards[board_id].getTitle());
        model.addAttribute("content", boardList.boards[board_id].getContent());

        return "BoardView/CorrespondBoardView";
    }

}
