package com.company.HashTable;

import java.util.LinkedList;

public class HashTableExample {
    private LinkedList<Node>[] table;

    public HashTableExample(int size) {
        table = new LinkedList[size];
    }

    Long getHashCode(String key) {
        Long hashCode = 0L;

        for (char c : key.toCharArray()) { hashCode += (long) c; }

        return hashCode;
    }

    public int getIndex(Long hashCode) {
        return (int) (hashCode % table.length);
    }

    Node searchNode(int index, String key) {
        LinkedList<Node> indexedList = table[index];

        for (Node n : indexedList) {
            if (n.key.equals(key)) { return n; }
        }

        return null;
    }

    public void put(String key, String value) {
        Long hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
            table[index].add(new Node(key, value));
        }
        else {
            Node searched = searchNode(index, key);

            if (searched != null) { searched.value = value; }
            else { table[index].add(new Node(key, value)); }
        }
    }

    public String get(String key) {
        Long hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        Node searched = searchNode(index, key);

        if (searched == null) { return ""; }
        else { return searched.value; }
    }

    class Node {
        String key;
        String value;
        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
