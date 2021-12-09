package Project.Chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameManager GM = new GameManager(BoardSets.StdBoard);
        GM.drawBoard();
        boolean winnerFound = false;
        PlaceData selectedPiecePlace = new PlaceData(0,0);
        PlaceData selectedMovePlace = new PlaceData(0,0);
        while (!winnerFound){
        //cod ca sa selectezi o piesa si sa stochezi datale in obiecte place data
        //cod ca sa arati pe ecran locurile unde poti muta
        GM.movePiece(selectedPiecePlace.x, selectedPiecePlace.y, selectedMovePlace.x, selectedMovePlace.y);
        GM.drawBoard();
        GM.checkForWinner();
        }
    }

}
