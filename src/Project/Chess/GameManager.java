package Project.Chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameManager {
    private List<List<ChessPiece>> board;
    private List<ChessPiece> deadPieces = new ArrayList<>();
    boolean isWhiteTunrn = true;
    public GameManager (List<List<ChessPiece>> board){
        this.board = board;
    }

    void movePiece(int xFrom,int yFrom,int xTo,int yTo){
        board.get(xTo).set(yTo,board.get(xFrom).get(yFrom));
        board.get(xFrom).set(yFrom, null);
        isWhiteTunrn = !isWhiteTunrn;
    }
    public void drawBoard(){
        /*code to draw the board to the screen unsig this.board
        aici intra in joc acel enum, ca sa nu creez 8 sau 2 obiecte cu sprite-urile identice, pot sa le stochez intr-o clasa separata si sa le accesez pe baza Piece.type si isWhite
        */
    }

    public void checkForWinner(){
        //cod ca sa verificam conditiile de castig si daca da apleam metoda drawWinnerDialogBox()
    }

    public void drawWinnerDialogBox(){
        //cod ca sa desenez dialog box-ul in sine
        if(isWhiteTunrn){
            //text-ul din cutie devine White wins
        } else {/*textul din cutie devine Black wins*/}
    }

    class Pawn {
        public void moveForward(int piecex,int piecey){
            movePiece(piecex,piecey,piecex,piecey+ (board.get(piecex).get(piecey).isWhite ? 1:-1));
        }
        /* aici am implementat codul pentru capure pentru ca nu am citit cerinta cu atentie...
        public void attackAbsLeft(int piecex,int piecey){
            if(board.get(piecex-1).get(piecey+(board.get(piecex).get(piecey).isWhite?1:-1)) != null){
                deadPieces.add(deadPieces.size()-1,board.get(piecex-1).get(piecey+ (board.get(piecex).get(piecey).isWhite?1:-1)));
                movePiece(piecex,piecey,piecex-1,piecey+ (board.get(piecex).get(piecey).isWhite?1:-1));
            }
        }
        public void attackAbsRight(int piecex,int piecey){
            if(board.get(piecex+1).get(piecey+(board.get(piecex).get(piecey).isWhite?1:-1)) != null){
                deadPieces.add(deadPieces.size()-1,board.get(piecex+1).get(piecey+ (board.get(piecex).get(piecey).isWhite?1:-1)));
                movePiece(piecex,piecey,piecex+1,piecey+ (board.get(piecex).get(piecey).isWhite?1:-1));
            }*/
        }
}

