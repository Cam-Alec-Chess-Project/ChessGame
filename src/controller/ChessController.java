package controller;
import board.PaintChessBoard;
import moves.MouseMovement;
import javax.swing.*;

public class ChessController {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Chess Game");
        frame.setSize(800,820);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JPanel chessPanel = new PaintChessBoard();
        chessPanel.addMouseListener(new MouseMovement()); //allows our mouseListener to work
        frame.add(chessPanel);
        frame.setVisible(true);
    }
}
