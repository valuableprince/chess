//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаем шахматную доску 8x8
        ChessBoard chessBoard = new ChessBoard();

        // Создаем фигуры
        ChessPiece whitePawn = new Pawn("White");
        ChessPiece blackPawn = new Pawn("Black");
        ChessPiece whiteKnight = new Horse("White");
        ChessPiece blackKnight = new Horse("Black");
        ChessPiece whiteRook = new Rook("White");
        ChessPiece blackRook = new Rook("Black");
        ChessPiece whiteBishop = new Bishop("White");
        ChessPiece blackBishop = new Bishop("Black");
        ChessPiece whiteQueen = new Queen("White");
        ChessPiece blackQueen = new Queen("Black");
        ChessPiece whiteKing = new King("White");
        ChessPiece blackKing = new King("Black");

        // Размещаем фигуры на доске (по шахматным правилам)
        chessBoard.placePiece(whitePawn, 1, 0); // Белая пешка
        chessBoard.placePiece(blackPawn, 6, 0); // Черная пешка
        chessBoard.placePiece(whiteKnight, 0, 1); // Белый конь
        chessBoard.placePiece(blackKnight, 7, 1); // Черный конь
        chessBoard.placePiece(whiteRook, 0, 0); // Белая ладья
        chessBoard.placePiece(blackRook, 7, 0); // Черная ладья
        chessBoard.placePiece(whiteBishop, 0, 2); // Белый слон
        chessBoard.placePiece(blackBishop, 7, 2); // Черный слон
        chessBoard.placePiece(whiteQueen, 0, 3); // Белая ферзь
        chessBoard.placePiece(blackQueen, 7, 3); // Черная ферзь
        chessBoard.placePiece(whiteKing, 0, 4); // Белый король
        chessBoard.placePiece(blackKing, 7, 4); // Черный король

        // Печатаем начальное состояние доски
        chessBoard.printBoard();

        // Пример движения фигур (можно добавить свои ходы)
        // Белая пешка двигается на одну клетку вперед
        if (whitePawn.canMoveToPosition(chessBoard, 1, 0, 2, 0)) {
            chessBoard.movePiece(1, 0, 2, 0);
            System.out.println("Белая пешка двинулась на 2 клетки вперед.");
        }

        // Черный конь двигается по букве "Г"
        if (blackKnight.canMoveToPosition(chessBoard, 7, 1, 5, 2)) {
            chessBoard.movePiece(7, 1, 5, 2);
            System.out.println("Черный конь двинулся на позицию (5, 2).");
        }

        // Печатаем состояние доски после ходов
        chessBoard.printBoard();
    }
}
