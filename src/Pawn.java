public class Pawn extends ChessPiece{    // фигура пешка

    Pawn(String color) {
        super(color);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line!=toLine || column!=toColumn) {
            return color.equals("White") && line == 1 && toLine == 3 && column == toColumn ||
                    color.equals("White") && line >= 1 && line < 7 && toLine - line == 1 && column == toColumn ||
                    color.equals("Black") && line == 6 && toLine == 4 && column == toColumn ||
                    color.equals("Black") && line <= 6 && toLine - line == -1 && column == toColumn;
        }
        return false;
    }

    @Override
    String getSymbol() {
        return "P";
    }
}
