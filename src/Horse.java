public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка, чтобы не выйти за пределы доски
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        // Проверка хода "буквой Г"
        int deltaLine = Math.abs(toLine - line);
        int deltaColumn = Math.abs(toColumn - column);

        // Конь ходит на две клетки в одном направлении и на одну в другом
        return (deltaLine == 2 && deltaColumn == 1) || (deltaLine == 1 && deltaColumn == 2);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}

