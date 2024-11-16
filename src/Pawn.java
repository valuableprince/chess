public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        // Пешка может двигаться только вперед по одной клетке, кроме первого хода
        if (color.equals("White")) {
            if (line == 1) {
                return (toLine == line + 2 && column == toColumn) || (toLine == line + 1 && column == toColumn);
            } else {
                return toLine == line + 1 && column == toColumn;
            }
        } else {
            if (line == 6) {
                return (toLine == line - 2 && column == toColumn) || (toLine == line - 1 && column == toColumn);
            } else {
                return toLine == line - 1 && column == toColumn;
            }
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
