public class TicTacToeMapping {

    public static void main(String[] args) {

        int slot = 7; // you can change this to test

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    // Convert slot → row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot → column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}