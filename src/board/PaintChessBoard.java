package board;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class PaintChessBoard extends JPanel {

    private final BoardArray board = new BoardArray();
    private final GamePieceSetup gamePieceSetup = new GamePieceSetup();


    /**
     * Method used to paint the chess board
     * @param g
     */
    public void paint(Graphics g) {
        super.paint(g);
        //Graphics2D g2 = (Graphics2D) g;
        boolean isWhite = true;
        for (int row = 0; row < board.getBoard().length; row++) {
            for (int col = 0; col < board.getBoard().length; col++) {
                Color color;
                if (isWhite) {
                    color = Color.WHITE;

                } else {
                    color = Color.BLACK;

                }
                isWhite = !isWhite;
                g.drawRect(100 * row, 100 * col, 100, 100); // layout for maze
                g.setColor(color);
                g.fillRect(100 * row, 100 * col, 800 / 8, 800 / 8); // colors in squares for rect
                g.setColor(Color.BLACK);

            }
            isWhite = !isWhite;
        }
        try {
            gamePieceSetup.setUpGame(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




