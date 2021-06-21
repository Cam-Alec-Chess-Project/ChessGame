package moves;
import chessPieces.Piece;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMovement implements MouseListener, MouseMotionListener{
    int x = -1;
    int y = -1;
    MovePiece movePiece = new MovePiece();
    Piece piece;

    @Override
    public void mouseClicked(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
       // piece.movePieceLocation(x,y);
       // piece.savePieceLocation(e.getX(),e.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released at Coordinates " + x + " " + y);
        this.x=e.getX();
        this.y=e.getY();
       // piece.updatePieceLocation(x,y,movePiece.getSaveLoc());
       // gamePiece.repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


}
