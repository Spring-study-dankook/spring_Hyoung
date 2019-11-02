package com.dku.springstudy.service;

import com.dku.springstudy.vo.AllBoards;
import com.dku.springstudy.vo.User;

public class BoardService {

    // 입력받은 제목이 Data 안에 존재하는지 확인하는 service
    public int IsTitleExisted (AllBoards boards, String inputTitle) {
        for(int i=0; i<3 ; i++) {
            if(boards.boards[i].getTitle().equals(inputTitle))
                return i;
        }
        return 0;
    }

    public void ModifyContents (AllBoards boards, int board_id,
                                String inputTitle, String inputContent) {
        boards.boards[board_id - 1].setContent(inputContent);
    }
}


