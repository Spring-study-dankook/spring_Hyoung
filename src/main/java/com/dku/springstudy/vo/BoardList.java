package com.dku.springstudy.vo;

import com.google.common.collect.Lists;

import java.util.List;

public class BoardList {
    public static List<Board> boards = Lists.newArrayList(
            new Board("JAVA", "WTF"),
            new Board("KOTLIN", "TREND"),
            new Board("JAVASCRIPT", "SO HARD")
    );
}
