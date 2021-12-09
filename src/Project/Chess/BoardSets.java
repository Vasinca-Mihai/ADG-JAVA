package Project.Chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BoardSets {// folosim custom boards creand o noua lista si initializand un GM cu ea
    public static List<List<ChessPiece>> StdBoard = new ArrayList<List<ChessPiece>>(Arrays.asList(
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false)),
            Arrays.asList(
                    new Placeholder(true),
                    new Pawn(true),
                    null, null, null, null,
                    new Pawn(false),
                    new Placeholder(false))));
}
