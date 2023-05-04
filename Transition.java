public class Transition {
    private State nextState;
    private char symbol;
    private String direction;

    //this symbol is the symbol that the Transition is writing -- it is different from the State variable
    public Transition(State nextState, char symbol, String direction){
        this.nextState = nextState;
        this.symbol = symbol;
        this.direction = direction;
    }

    public State nexState(){
        return nextState;
    }

    public char writeSymbol(){
        return symbol;
    }

    public String direction(){
        return direction;
    }
}


//A Transition class that keeps track of a tape symbol as input and the results: 
//what state to move to next, what to write, and whether to move the tape left or right.