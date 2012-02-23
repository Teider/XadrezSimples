package game;

import exceptions.InvalidLocationException;

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
        if(location.isValid()) {
            return board[location.getColumn()][location.getLine()];
        } else {
            throw new InvalidLocationException();
        }
    }
    
    boolean isOccupiedByOpponent(Piece piece, Location location) {
        Piece p = null;
        try {
            p = getPiece(location);
        } catch(InvalidLocationException e) {
            e.printStackTrace();
        }
        if(p != null && p.getColor() != piece.getColor()) {
            return true;
        }
        return false;
    }
    
    boolean isOccupiedByAlly(Piece piece, Location location) {
        Piece p = null;
        try {
            p = getPiece(location);
        } catch(InvalidLocationException e) {
            e.printStackTrace();
        }
        if(p != null && p.getColor() == piece.getColor()) {
            return true;
        }
        return false;
    }
}
