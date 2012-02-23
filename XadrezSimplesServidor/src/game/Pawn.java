package game;

import util.Constants;

/**
 *
 * @author lucascp
 */
public class Pawn extends Piece  {
    
    public Pawn(Location location, Constants.Color color, Constants.PieceType type, Board board) {
        super(location, color, type);
    }

    @Override
    public boolean Move(Location move) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
