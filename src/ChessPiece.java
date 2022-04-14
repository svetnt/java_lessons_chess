public abstract class ChessPiece {

    String color;                   // цвет фигуры
    boolean chek;                   //

    ChessPiece(String color){
        this.color=color;
        this.chek=true;
    }

   abstract String getColor();           // метод возвращает цвет фигуры

    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    // метод возвращает true, если фигура может сходить из line column  в  toLine toColumn

    abstract String getSymbol();        // метод возвращает тип фигуры


}
