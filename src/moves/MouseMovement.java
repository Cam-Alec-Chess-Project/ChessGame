package moves;
import board.ChessHashMap;
import chessPieces.Piece;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMovement implements MouseListener, MouseMotionListener{
    int x = -1;
    int y = -1;
    //MovePiece movePiece = new MovePiece();
   // Piece piece;
    ChessHashMap chessHashMap = new ChessHashMap();

    @Override
    public void mouseClicked(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
        int roundX = (x / 100) * 100;
        int roundY = (y / 100) * 100;

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
        int roundX = (x / 100) * 100;
        int roundY = (y / 100) * 100;
        System.out.println("Mouse Pressed X Location: " + roundX + " Y Location: " + roundY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        this.x=e.getX();
        this.y=e.getY();
        int roundX = (x / 100) * 100;
        int roundY = (y / 100) * 100;
        System.out.println("Rounded X to :  " + roundX + " Rounded Y to :" + roundY);

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
