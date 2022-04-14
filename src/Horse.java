public class Horse extends ChessPiece{    // фигура Конь

    Horse(String color) {
        super(color);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line!=toLine || column!=toColumn) {
            if (line >= 0 && line <= 6 && toLine - line == 1 ||
                    line >= 0 && line <= 5 && toLine - line == 2 ||
                    line >= 1 && line <= 7 && toLine - line == -1 ||
                    line >= 2 && line <= 7 && toLine - line == -2 &&
                            column >= 0 && column <= 6 && toColumn - column == 1 ||
                    column >= 0 && column <= 5 && toColumn - column == 2 ||
                    column >= 1 && column <= 7 && toColumn - column == -1 ||
                    column >= 2 && column <= 7 && toColumn - column == -2) {
                return true;
            } else {return false;}
        } else {return false;}
    }

    @Override
    String getSymbol() {
        return "H";
    }
}
