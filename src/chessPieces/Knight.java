package chessPieces;

public class Knight extends Piece {
    private Object Knight;


    @Override
    public Piece type(Piece p) {
        p = (Piece) this.Knight;
        return p;
    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
