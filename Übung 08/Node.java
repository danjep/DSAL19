class Node {
    boolean visited;
    Integer value;
    Integer level;

    public Node() {
        value = null;
        level = null;
    }

    public Node(int item, int level_helper) {
        value = item;
        level = 0;
        while(level_helper > 0) {
            level_helper = (level_helper - 1) / 3;
            level++;
        }
    }
}
