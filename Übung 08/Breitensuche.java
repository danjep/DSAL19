public class Breitensuche {

    static int ziel = 1889;
    static int start = 2019;
    static Queue q = new Queue();

    private static void main(String args) {
        int v = start;
        q.push(start);
        while(true) {
            int v = q.pop();
            if(v != ziel) {
                q.push(eins(v));
                q.push(zwei(v));
                q.push(drei(v));
            } else {
                System.out.println("Ziel gefunden!");
                break;
            }
        }

    }

    private static int eins(int x) {
        x = x + 7;
        return x;
    }

    private static int zwei(int x) {
        x = 2 * x;
        return x;
    }

    private static int drei(int x) {
        if((x % 3) == 0) {
            x = x / 3;
            return x;
        } else {
            return null;
        }
    }

}
