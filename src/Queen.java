public class Queen extends ChessPiece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка, чтобы не выйти за пределы доски
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        // Ферзь может двигаться по прямой или по диагонали
        return (line == toLine) || (column == toColumn) || (Math.abs(toLine - line) == Math.abs(toColumn - column));
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}

