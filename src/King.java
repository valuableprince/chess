public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка, чтобы не выйти за пределы доски
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        // Король может двигаться на одну клетку в любую сторону
        return Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    // Метод для проверки, под атакой ли король
    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        // Логика для проверки атак
        // Примерная реализация (потребуется доработать)
        return false;
    }
}
