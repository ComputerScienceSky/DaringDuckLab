public class Tape extends DaringDuckLab{
    private char[] tape;
    private int head;

    public Tape(String input) {
        this.tape = input.toCharArray();
        this.head = 0;
    }

    public void moveLeft() {
        if (head == 0) {
            char[] newTape = new char[tape.length * 2];
            System.arraycopy(tape, 0, newTape, tape.length, tape.length);
            tape = newTape;
            head = tape.length / 2;
        } else {
            head--;
        }
    }

    public void moveRight() {
        if (head == tape.length - 1) {
            char[] newTape = new char[tape.length * 2];
            System.arraycopy(tape, 0, newTape, 0, tape.length);
            tape = newTape;
        }
        head++;
    }

    public char read() {
        return tape[head];
    }

    public void write(char symbol) {
        tape[head] = symbol;
    }

    public int countOnes() {
        int count = 0;
        for (char symbol : tape) {
            if (symbol == '1') {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return new String(tape);
    }
}
