package Stack;

import Models.Piece;

import java.util.LinkedList;
import java.util.List;

public class GenericStack {
    private List<Object> objects = new LinkedList<Object>();

    public void insert(Piece newObj) {
        this.objects.add(newObj);
    }

    public Object remove() {
        return this.objects.remove(this.objects.size() - 1);
    }

    public boolean empty() {
        return this.objects.size() == 0;
    }
}
