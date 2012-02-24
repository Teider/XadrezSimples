package game;

import exceptions.InvalidLocationException;
import java.util.Set;
import java.util.TreeSet;
import util.Constants;
import util.Constants.Color;

/**
 *
 * @author lucascp
 */
public class Board {

    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
    }

    Piece getPiece(Location location) throws InvalidLocationException {
        if (location.isValid()) {
            return board[location.getColumn()][location.getLine()];
        } else {
            throw new InvalidLocationException();
        }
    }

    boolean isOccupied(Location location) {
        Piece p = null;
        try {
            p = getPiece(location);
        } catch (InvalidLocationException e) {
            e.printStackTrace();
        }
        if (p != null) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOccupiedByOpponent(Piece piece, Location location) {
        Piece p = null;
        try {
            p = getPiece(location);
        } catch (InvalidLocationException e) {
            e.printStackTrace();
        }
        if (p != null && p.getColor() != piece.getColor()) {
            return true;
        }
        return false;
    }

    boolean isOccupiedByAlly(Piece piece, Location location) {
        Piece p = null;
        try {
            p = getPiece(location);
        } catch (InvalidLocationException e) {
            e.printStackTrace();
        }
        if (p != null && p.getColor() == piece.getColor()) {
            return true;
        }
        return false;
    }

    public boolean isKingInCheck(Color color) {
        Set<Piece> opponent_pieces = new TreeSet<Piece>();
        Location king_location = null;
        Piece p;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                p = board[i][j];
                if (p != null) {
                    if (p.getColor() == color && p.getType() == Constants.PieceType.KING) {
                        king_location = p.getLocation();
                    } else if (p.getColor() != color) {
                        opponent_pieces.add(p);
                    }
                }
            }
        }
        for(Piece op : opponent_pieces) {
            if(op.getAttackChoices().contains(king_location))
                return true;
        }
        return false;
    }
    
    public boolean isKingInCheckMate(Color color) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public boolean move(Piece piece, Location location) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public String makeFEN() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
