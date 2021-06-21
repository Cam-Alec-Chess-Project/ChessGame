package chessPieces;

public class Queen extends Piece {

    @Override
    public Piece type(Piece p) {
        return null;
    }

    @Override
    public boolean isValid(int x, int y) {
        return false;
    }
}
