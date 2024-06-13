package HashTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable {
    private List<List<String>> table = new ArrayList<List<String>>();
    private int length = 0;

    public void HashSet() {
        for (int i = 0; i < 26; i++) {
            LinkedList<String> list = new LinkedList<String>();
            table.add(list);
        }
    }

    private int getTableIndex(String word) {
        int hashCode = this.getHashCode(word);
        hashCode = Math.abs(hashCode);
        return hashCode % table.size();
    }

    public void add(String word) {
        if(!this.has(word)) {
            int index = this.getTableIndex(word);
            List<String> list = this.table.get(index);
            list.add(word);
            this.length++;
        }
    }

    public List<String> getAll() {
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < this.table.size(); i++) {
            words.addAll(this.table.get(i));
        }
        return words;
    }

    public void remove(String word) {
        if (this.has(word)) {
            int index = this.getTableIndex(word);
            List<String> list = this.table.get(index);
            list.remove(word);
            this.length--;
        }
    }

    public boolean has(String word) {
        int index = this.getTableIndex(word);
        List<String> list = this.table.get(index);
        return list.contains(word);
    }

    public void printTable() {
        for (List<String> list: this.table) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

    private int getHashCode(String word) {
        int code = 1;
        for (int i = 0; i < word.length(); i++) {
            code = 31 * code + word.charAt(i);
        }
        return code;
    }


}
