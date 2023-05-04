import java.util.ArrayList;
import java.util.List;
public class StateMachine {
    private Tape tape; 
    private State current;
    private List<State> states = new ArrayList<>();

    public StateMachine(String input, State start){
        this.tape = new Tape(input);
        this.current = start;
        states.add(start);
    }

    public void addState(State state){
        states.add(state);
    }

    //runs the actual turing machine
    public void run(){
        while(!current.isTerminal()){
            //reads the value on the tape and finds the current state's transition for that input 
            char val = tape.read();
            Transition transition = current.getTransition(val);
            //writes the new symbol via the transition on the tape
            tape.write(transition.writeSymbol());
            //move the tape in the correct direction
            if(transition.direction().equals("right")){
                tape.moveRight();
            }else{
                tape.moveLeft();
            }
            //set the current state to the next state
            current = transition.nexState();
        }
    }

    public String getOutput(){
        return tape.countOnes();
    }
}

//A StateMachine class that holds all of the states, 
//keeps track of what the current state is, and given an input, 
//moves to the next state and tells the tape to move left and right.

//addstate method
//run function
//getoutput (tostring)