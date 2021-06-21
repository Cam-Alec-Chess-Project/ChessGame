package chessPieces;

import java.util.HashMap;
import java.util.Map;

public abstract class Piece {
    Map<Integer, Integer> saveLoc = new HashMap<>();
    private String type;
    public abstract Piece type(Piece p);

    public Map<Integer, Integer> updatePieceLocation(int x, int y) {
       // x = ((x + 99) / 100 ) * 100;
      //  y = ((y + 99) / 100 ) * 100;
        //saveLoc.put(x,y);
        System.out.println("Update Piece "+ saveLoc);
        return saveLoc;
    }

    public void savePieceLocation(int x, int y)
    {
        saveLoc.put(x,y);
        System.out.println(x+y);
    }
    public abstract boolean isValid(int x , int y);
    //the top two methods can have logic implemented here
}
