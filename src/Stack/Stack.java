package Stack;

import Models.Piece;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private List<Piece> pieces = new LinkedList<Piece>();

    public void insert(Piece newPiece) {
        this.pieces.add(newPiece);
    }

    public Piece remove() {
        return this.pieces.remove(this.pieces.size() -1);
    }

    public boolean empty() {
        return this.pieces.size() == 0;
    }
}
