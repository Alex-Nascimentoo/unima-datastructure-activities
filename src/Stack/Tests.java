package Stack;

import Models.Piece;

public class Tests {
    public static void TestStack() {
        Stack stack = new Stack();

        Piece piece = new Piece();
        stack.insert(piece);

        Piece removedPiece = stack.remove();

        if(piece != removedPiece) {
            System.out.println("Error: the removed piece  is equals to the one inserted");
        }

        if(!stack.empty()) {
            System.out.println("Error: the stack is not empty!");
        }
    }

    public static void TestGenericStack() {
        GenericStack pieceStack = new GenericStack();

        Piece piece = new Piece();
        pieceStack.insert(piece);

        Piece removedPiece = (Piece) pieceStack.remove();

        if(piece != removedPiece) {
            System.out.println("Error: the removed piece  is equals to the one inserted");
        }

        if(!pieceStack.empty()) {
            System.out.println("Error: the generic stack is not empty!");
        }
    }

    public static void TestParamStack() {
        ParamStack<Piece> pieceStack = new ParamStack<Piece>();

        Piece piece = new Piece();
        pieceStack.insert(piece);

        Piece removedPiece = pieceStack.remove();

        if(piece != removedPiece) {
            System.out.println("Error: the removed piece  is equals to the one inserted");
        }

        if(!pieceStack.empty()) {
            System.out.println("Error: the generic stack is not empty!");
        }

        ParamStack<String> stringStack = new ParamStack<String>();

        stringStack.insert("Alex");
        stringStack.insert("Davi");

        System.out.println(stringStack.remove());
        System.out.println(stringStack.remove());
    }
}
