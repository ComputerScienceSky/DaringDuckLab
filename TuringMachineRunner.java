public class TuringMachineRunner extends DaringDuckLab{
    public static void main(String[] args) {
        // Define the states
        State startState = new State("start", false);
        State finalState = new State("final", true);

        // Define the transitions for the start state
        Transition startToFinal = new Transition(finalState, '1', true);
        startState.addTransition('0', startToFinal);

        // Define the Turing machine
        StateMachine turingMachine = new StateMachine("0000", startState);
        turingMachine.addState(finalState);

        // Run the Turing machine
        turingMachine.run();

        // Output the result
        if (turingMachine.getOutput() == 1) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure.");
        }
    }
}
