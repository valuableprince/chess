public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка, чтобы не выйти за пределы доски
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        // Ладья ходит по прямой, то есть либо по вертикали, либо по горизонтали
        return (line == toLine) || (column == toColumn);
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
