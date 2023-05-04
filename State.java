import java.util.ArrayList;
import java.util.List;

public class State extends DaringDuckLab{
    private String name;
    private boolean terminal;
    private List<Transition> transitions = new ArrayList<>();
    private char[] symbols = new char[0];

    public State(String name, boolean terminal){
        this.name = name;
        this.terminal = terminal;
    }

    //symbol is the input in which the state takes this transition
    public void addTransition(char symbol, Transition transition){
        //adds the symbol to the end of the array
        symbols = new char[symbols.length + 1];
        symbols[symbols.length - 1] = symbol;

        //adds transition to the end of the transition list
        transitions.add(transition);

    }

    public Transition getTransition(char symbol){
        for(int i = 0; i < symbols.length; i++){
            if(symbols[i] == symbol){
                return transitions.get(i);
            }
        }
        return new Transition();
    }

    public boolean isTerminal(){
        return terminal;
    }

    @Override
    public String toString(){
        return name;
    }
}

// A State class that holds a name, various Transitions, and knows whether or not it is a terminal state.


//State constructor with name and boolean is terminal state
//add transition function that adds type transitions to a state
//list of transitions