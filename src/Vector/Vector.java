package Vector;

public class Vector {
    private Object[] objects = new Object[100000];

    private int totalObjects = 0;

    public void add(Object obj) {
        this.grantSpace();

        this.objects[totalObjects] = obj;

        this.totalObjects++;
    }

    public void add(int position, Object obj) {
        this.grantSpace();

        if(!this.isPositionOccupied(position)) {
            throw new IllegalArgumentException("Invalid position!");
        }

        for(int i = this.totalObjects; i > position; i--) {
            this.objects[i] = this.objects[i - 1];
        }

        this.objects[position] = obj;
        this.totalObjects++;
    }

    public Object get(int position) {
        if(!this.isPositionOccupied(position)) {
            throw new IllegalArgumentException("Invalid position!");
        }

        return this.objects[position];
    }

    public void remove(int position) {
        if(!isPositionOccupied(position)) {
            throw new IllegalArgumentException("Invalid position!");
        }

        for (int i = position; i < this.objects.length - 1; i++) {
            this.objects[i] = this.objects[i + 1];
        }

        this.totalObjects--;
    }

    private void grantSpace() {
        if(this.totalObjects == this.objects.length) {
            Object[] newArray = new Object[this.objects.length * 2];

            for (int i = 0; i < this.objects.length; i++) {
                newArray[i] = this.objects[i];
            }

            this.objects = newArray;
        }
    }

    public boolean has(Object obj) {
        for (int i = 0; i < this.totalObjects; i++) {
            if (obj == this.objects[i]) {
                return true;
            }
        }

        return false;
    }

    private boolean isPositionOccupied(int pos) {
        return pos >= 0 && pos <= this.totalObjects;
    }

    public int length() {
        return this.totalObjects;
    }

    public String toString() {
        if (this.totalObjects == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalObjects - 1; i++) {
            builder.append(this.objects[i]);
            builder.append(", ");
        }

        builder.append(this.objects[this.totalObjects - 1]);
        builder.append("]");
        return builder.toString();
    }
}