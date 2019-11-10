package com.dku.springstudy.vo;

import com.google.common.collect.Lists;

import java.util.List;

public class BoardList {
    public static List<Board> boards = Lists.newArrayList(
            new Board(BoardType.LANGUAGE, "JAVA", "WTF"),
            new Board(BoardType.MUSIC, "Lauv", "Sims"),
            new Board(BoardType.IDE, "JetBrains", "IntelliJ IDEA")
    );
}
