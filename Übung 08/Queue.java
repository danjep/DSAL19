public class Queue {

    int[] content = new int[100];
    int head = 0;
    int tail = 0;

    private boolean isEmpty() {
        if(content[tail] == 0 /*null*/ ) {
            return true;
        } else {
            return false;
        }
    }

    private void push(int x) {
        head++;
        content[head] = x;
    }

    private int pop() {
        int temp = content[tail];
        for (int i = 0; i < head - 1; i++) {
            content[i] = content[i + 1];
        }
        //content[head] = null
        head--;
        return temp;
    }

    private int top() {
        return content[tail];
    }

}
