package at.ftmahringer.gridgames.Chess.Pieces;

import at.ftmahringer.gridgames.Chess.Pieces.Types.*;

public enum PieceType {
    PAWN,
    ROOK,
    KNIGHT,
    BISHOP,
    QUEEN,
    KING;

    public static PieceType fromString(String s) {
        return switch (s) {
            case "PAWN" -> PAWN;
            case "ROOK" -> ROOK;
            case "KNIGHT" -> KNIGHT;
            case "BISHOP" -> BISHOP;
            case "QUEEN" -> QUEEN;
            case "KING" -> KING;
            default -> null;
        };
    }

    public static String toString(PieceType pt) {
        return switch (pt) {
            case PAWN -> "PAWN";
            case ROOK -> "ROOK";
            case KNIGHT -> "KNIGHT";
            case BISHOP -> "BISHOP";
            case QUEEN -> "QUEEN";
            case KING -> "KING";
        };
    }

    // Make it, so that foe each Type, there is a corresponding Piece
    public BasePiece createPiece() {
        return switch (this) {
            case PAWN -> new Pawn();
            case ROOK -> new Rook();
            case KNIGHT -> new Knight();
            case BISHOP -> new Bishop();
            case QUEEN -> new Queen();
            case KING -> new King();
        };
    }

    public boolean isWhite() {
        return switch (this) {
            case PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING -> true;
            default -> false;
        };
    }
}
