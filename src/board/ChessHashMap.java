package board;

import chessPieces.Piece;

import java.util.HashMap;

public class ChessHashMap {

    /**
     * Method used to save location of the chess pieces at the start of game
     */
    HashMap<Integer, Piece> Map = new HashMap<>();
    public void Hash(Piece p, int x, int y) {
        System.out.println(p);
        Integer hashfunc = ((x + y)*(x + y + 1)/2) + y;
        Map.put(hashfunc, p);
        System.out.println(Map.size());
    }

}
