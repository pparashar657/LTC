package recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {

        towerOfHanoi(4, 'A', 'C', 'B');

    }

    static void towerOfHanoi(int n, char from, char to, char inter) {
        if(n == 1) {
            System.out.println(n +" : " + from +" -> " + to);
            return;
        }
        towerOfHanoi(n-1, from, inter, to);
        System.out.println(n +" : " + from +" -> " + to);
        towerOfHanoi(n-1, inter, to, from);
    }

}
