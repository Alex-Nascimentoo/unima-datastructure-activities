package LinkedList;

public class Cell {
    private Cell next;

    private Object element;

    public Cell(Cell next, Object element) {
        this.next = next;
        this.element = element;
    }

    public Cell(Object element) {
        this.element = element;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }

    public Object getElement() {
        return element;
    }


}
