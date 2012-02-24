package game;

import java.util.Set;
import util.Constants.Color;
import util.Constants.PieceType;

/**
 *
 * @author lucascp
 */
public abstract class Piece {

    private Location location;
    private Color color;
    private PieceType type;
    private Board board;

    public Piece(Location location, Color color, PieceType type) {
        this.location = location;
        this.color = color;
        this.type = type;
    }
  
    public abstract Set<Location> getMovementChoices();
    
    public abstract Set<Location> getAttackChoices();

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }
}
