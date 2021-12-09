package Project.Chess;

public abstract class ChessPiece {
    boolean isWhite;
    PieceType type;

    public boolean isWhite() {
        return isWhite;
    }

    public PieceType getPieceType(){
        return this.type;
    }
}
