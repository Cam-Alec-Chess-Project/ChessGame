package chessPieces;

public class Pawn extends Piece {

    private Object Pawn;

    @Override
    public Piece type(Piece p) {
        p = (Piece) this.Pawn;
        return p;
    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
