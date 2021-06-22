package chessPieces;

public class Queen extends Piece {
    private Object Queen;

    @Override
    public Piece type(Piece p) {
        p = (Piece) this.Queen;
        return p;
    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
