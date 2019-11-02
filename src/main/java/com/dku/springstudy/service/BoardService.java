package com.dku.springstudy.service;
import com.dku.springstudy.vo.AllBoards;

public class BoardService {

    // 입력받은 제목이 Data 안에 존재하는지 확인하는 service
    public int IsTitleExisted (AllBoards boards, String inputTitle) {
        for(int i=0; i<3 ; i++) {
            if(boards.boards[i].getTitle().equals(inputTitle))
                return i;
        }
        return -1;
    }

    // board_id에 해당하는 내용을 수정하는 service
    public void ModifyContents (AllBoards boards, int board_id, String inputContent) {
        boards.boards[board_id].setContent(inputContent);
    }
}


