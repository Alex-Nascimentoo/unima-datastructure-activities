package HashTable;

import java.util.List;

public class Tests {
    public static void TestAdd() {
        HashTable hash = new HashTable();
        hash.add("Rafael");
        hash.add("Ana");
        hash.add("Paulo");

        List<String> words = hash.getAll();

        for (String word: words) {
            System.out.println(word);
        }
    }

    public static void TestRemove() {
        HashTable hash = new HashTable();
        hash.add("Rafael");
        hash.add("Ana");
        hash.add("Paulo");
        List<String> words = hash.getAll();
        System.out.println("antes de remover");
        for (String word : words) {
            System.out.println(word);
        }
        hash.remove("Rafael");
        words = hash.getAll();
        System.out.println("depois de remover");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void TestHash() {
        HashTable hash = new HashTable();
        for (int i = 0; i < 100; i++) {
            hash.add("" + i);
        }
        hash.printTable();
    }

    public static void TestGenericHash() {
        ConjuntoEspalhamentoGenerico conjunto =
                new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        System.out.println(conjunto.pegaTodos());
    }
}
