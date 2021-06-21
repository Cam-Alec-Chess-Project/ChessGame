package board;
import chessPieces.Bishop;
import chessPieces.Pawn;
import chessPieces.Piece;
import moves.MouseMovement;
import moves.MovePiece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class GamePieceSetup extends JPanel{

    // 1. CREATE different JLabels for pieces


    private final BoardArray board = new BoardArray();
    MouseMovement mouseMovement = new MouseMovement();
    MovePiece movePiece = new MovePiece();
    Pawn pawn= new Pawn() ;
    Bishop bishop = new Bishop();
    Piece piece;

    private int x = -1;
    private int y = -1;

    public void setUpGame(Graphics g) throws IOException {

        //loading gamepiece images
        ClassLoader loader = getClass().getClassLoader();
        URL blackPawn = loader.getResource("chessImages/blackPawn.png");
        URL blackQueen = loader.getResource("chessImages/blackQueen.png");
        URL blackKing = loader.getResource("chessImages/blackKing.png");
        URL blackKnight = loader.getResource("chessImages/blackKnight.png");
        URL blackRook = loader.getResource("chessImages/blackRook.png");
        URL blackBishop = loader.getResource("chessImages/blackBishop.png");

        URL whitePawn = loader.getResource("chessImages/whitePawn.png");
        URL whiteRook = loader.getResource("chessImages/whiteRook.png");
        URL whiteKnight = loader.getResource("chessImages/whiteKnight.png");
        URL whiteQueen = loader.getResource("chessImages/whiteQueen.png");
        URL whiteBishop = loader.getResource("chessImages/whiteBishop.png");
        URL whiteKing = loader.getResource("chessImages/whiteKing.png");


        for (int row = 0; row < board.getBoard().length; row++) {
            for (int col = 0; col < board.getBoard().length; col++) {
                int xLocation = col * 100;
                int yLocation = row * 100;

                switch (board.getBoard()[row][col])
                {
                    case "PawnW":
                        assert whitePawn != null;
                        System.out.println(xLocation + yLocation);
                        g.drawImage(ImageIO.read(whitePawn), xLocation, yLocation, 75, 75, null);
                        // needs to save the image location
                       pawn.savePieceLocation(xLocation, yLocation);
                       pawn.updatePieceLocation(xLocation,yLocation);

                        break;

                    case "PawnB":
                        assert blackPawn != null;
                        g.drawImage(ImageIO.read(blackPawn),  xLocation, yLocation,75, 75, null);
                        break;

                    case "BishopW":
                        assert whiteBishop != null;
                        g.drawImage(ImageIO.read(whiteBishop), xLocation, yLocation, 75, 75, null);
                        break;

                    case "BishopB":
                        assert blackBishop != null;
                        g.drawImage(ImageIO.read(blackBishop), xLocation, yLocation, 75, 75, null);
                        break;

                    case "RookW":
                        assert whiteRook != null;
                        g.drawImage(ImageIO.read(whiteRook), xLocation, yLocation, 75, 75, null);
                        break;

                    case "RookB":
                        assert blackRook != null;
                        g.drawImage(ImageIO.read(blackRook), xLocation, yLocation, 75, 75, null);
                        break;

                    case "KnightW":
                        assert whiteKnight != null;
                        g.drawImage(ImageIO.read(whiteKnight), xLocation, yLocation, 75, 75, null);
                        break;

                    case "KnightB":
                        assert blackKnight != null;
                        g.drawImage(ImageIO.read(blackKnight), xLocation, yLocation, 75, 75, null);
                        break;

                    case "KingW":
                        assert whiteKing != null;
                        g.drawImage(ImageIO.read(whiteKing), xLocation, yLocation, 75, 75, null);
                        break;

                    case "KingB":
                        assert blackKing != null;
                        g.drawImage(ImageIO.read(blackKing), xLocation, yLocation, 75, 75, null);
                        break;

                    case "QueenW":
                        assert whiteQueen != null;
                        g.drawImage(ImageIO.read(whiteQueen), xLocation, yLocation, 75, 75, null);
                        break;

                    case "QueenB":
                        assert blackQueen != null;
                        g.drawImage(ImageIO.read(blackQueen), xLocation, yLocation, 75, 75, null);
                        break;

                    default:
                        break;
                }

            }

        }
    }


}



