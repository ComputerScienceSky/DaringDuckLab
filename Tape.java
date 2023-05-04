public class Tape extends DaringDuckLab{
    private char[] tape;
    private int pos;

    public Tape(String input) {
        this.tape = input.toCharArray();
        this.pos = 0;
    }

    public void moveLeft() {
        //if the head is in the first position you need to increase the tape size to move left -- could move elements, but that would take rlly long
        if (pos == 0) {
            char[] newTape = new char[tape.length * 2];
            System.arraycopy(tape, 0, newTape, tape.length, tape.length);
            tape = newTape;
            pos = tape.length / 2;
        } else {
            pos--;
        }
    }

    public void moveRight() {
        //if the head is in the last position you need to increase the size (pretty similar to moveLeft)
        if (pos == tape.length - 1) {
            char[] newTape = new char[tape.length * 2];
            System.arraycopy(tape, 0, newTape, 0, tape.length);
            tape = newTape;
        }
        //no else statement necessary cause you add to the pos either way
        pos++;
    }

    public char read() {
        return tape[pos];
    }

    public void write(char symbol) {
        tape[pos] = symbol;
    }

    public String countOnes() {
        int count = 0;
        for(int i = 0; i < tape.length; i++){
            if(tape[i] == '1'){
                count++;
            }
        }
        return "Number of Ones: " + count;
    }
}
