package game;

/**
 *
 * @author lucascp
 */
public class Location {

    private int line;
    private int column;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getLocation() {
        char a = (char) (97 + column);
        return "" + a + line;
    }

    public boolean setLocation(String location) {
        if (location.length() == 2) {
            int col = 97 - (int) (location.charAt(0));
            int lin = 48 - (int) (location.charAt(1));
            if (isValid()) {
                this.column = col;
                this.line = lin;
                return true;
            }
        }
        return false;
    }

    boolean isValid() {
        return (column >= 0 && line >= 0 && column <= 7 && line <= 7);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.line != other.line) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.line;
        hash = 41 * hash + this.column;
        return hash;
    }
}
