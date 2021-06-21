package chessPieces;

public class Bishop extends Piece {

    private Object Bishop;

    @Override
    public Piece type(Piece p) {
        p = (Piece) this.Bishop;
        return p;
    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
