public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка, чтобы не выйти за пределы доски
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        // Слон ходит только по диагонали
        return Math.abs(toLine - line) == Math.abs(toColumn - column);
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
