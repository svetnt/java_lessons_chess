public class ChessBoard {

        public ChessPiece[][] board = new ChessPiece[8][8]; // доска для гры
        String nowPlayer;                                   // чей сейчас ход

        public ChessBoard(String nowPlayer) {               //конструктор
            this.nowPlayer = nowPlayer;
        }

        public String nowPlayerColor() {                     //метод
            return this.nowPlayer;
        }

        public boolean moveToPosition(int startLine, int startColumn, int endLine, int endColumn) {  //двигает фигуры
            if (checkPos(startLine) && checkPos(startColumn)) {

                if (!nowPlayer.equals(board[startLine][startColumn].getColor())) return false;

                if (board[startLine][startColumn].canMoveToPosition(this, startLine, startColumn, endLine, endColumn)) {
                    board[endLine][endColumn] = board[startLine][startColumn]; // если фигура может двигаться-двигаем
                    board[startLine][startColumn] = null; // присвоить null в предыдущую ячейку
                    this.nowPlayer = this.nowPlayerColor().equals("White") ? "Black" : "White";

                    return true;
                } else return false;
            } else return false;
        }

        public void printBoard() {  //вывод доски в консоль
            System.out.println("Turn " + nowPlayer);
            System.out.println();
            System.out.println("Player 2(Black)");
            System.out.println();
            System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");

            for (int i = 7; i > -1; i--) {
                System.out.print(i + "\t");
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == null) {
                        System.out.print(".." + "\t");
                    } else {
                        System.out.print(board[i][j].getSymbol() + board[i][j].getColor().substring(0, 1).toLowerCase() + "\t");
                    }
                }
                System.out.println();
                System.out.println();
            }
            System.out.println("Player 1(White)");
        }

        public boolean checkPos(int pos) {
            return pos >= 0 && pos <= 7;
        }

}
