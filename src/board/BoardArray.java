package board;

public class BoardArray {


    private String[][] board = {
            {"RookB", "BishopB", "KnightB", "QueenB", "KingB", "KnightB", "BishopB", "RookB"},
            {"PawnB", "PawnB", "PawnB", "PawnB", "PawnB", "PawnB", "PawnB", "PawnB"},
            {"0", "1", "0", "1", "0", "1", "0","1"},
            {"1", "0", "1", "0", "1", "0", "1","0"},
            {"0", "1", "0", "1", "0", "1", "0","1"},
            {"1", "0", "1", "0", "1", "0", "1","0"},
            {"PawnW", "PawnW", "PawnW", "PawnW", "PawnW", "PawnW", "PawnW", "PawnW"},
            {"RookW", "BishopW", "KnightW", "KingW", "QueenW", "KnightW", "BishopW", "RookW"}};

    public String[][] getBoard() {
        return board;
    }

}


