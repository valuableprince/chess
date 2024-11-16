public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard() {
        // Создаем доску размером 8x8
        board = new ChessPiece[8][8];
    }

    // Размещение фигуры на доске
    public void placePiece(ChessPiece piece, int line, int column) {
        if (line >= 0 && line < 8 && column >= 0 && column < 8) {
            board[line][column] = piece;
        }
    }

    // Перемещение фигуры
    public void movePiece(int fromLine, int fromColumn, int toLine, int toColumn) {
        if (board[fromLine][fromColumn] != null && board[fromLine][fromColumn].canMoveToPosition(this, fromLine, fromColumn, toLine, toColumn)) {
            ChessPiece piece = board[fromLine][fromColumn];
            board[toLine][toColumn] = piece;
            board[fromLine][fromColumn] = null;
        }
    }

    // Печать текущего состояния доски
    public void printBoard() {
        System.out.println("Текущее состояние доски:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getSymbol() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    // Получение фигуры на позиции
    public ChessPiece getPiece(int line, int column) {
        if (line >= 0 && line < 8 && column >= 0 && column < 8) {
            return board[line][column];
        }
        return null;
    }
}
