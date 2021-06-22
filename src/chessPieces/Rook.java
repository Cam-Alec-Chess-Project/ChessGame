package chessPieces;

public class Rook extends Piece {
    private Object Rook;



    @Override
    public Piece type(Piece p) {
        p = (Piece) this.Rook;
        return p;
    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
