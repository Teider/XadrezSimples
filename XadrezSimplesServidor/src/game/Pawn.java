package game;

import java.util.Set;
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
    public Set<Location> getMovementChoices() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Location> getAttackChoices() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
