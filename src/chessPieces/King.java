package chessPieces;

public class King extends Piece {
    private Object King;



    @Override
    public Piece type(Piece p) {
        p = (Piece) this.King;
        return p;

    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
