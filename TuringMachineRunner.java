public class TuringMachineRunner extends DaringDuckLab{
    public static void main(String[] args) {
        // Define the states
        State preStart = new State("preStart", false);
        State startState = new State("start", false);
        State stateOne = new State("one", false);
        State stateTwo = new State("two", false);
        State stateThree = new State("three", false);
        State stateFour = new State("four", false);
        State stateFive = new State("five", false);
        State stateSix = new State("six", false);
        State stateSeven = new State("seven", false);
        State finalState = new State("final", true);

        // Define the transitions for the start state
        Transition startToInputEnd = new Transition(preStart, 'a', "right");
        preStart.addTransition('a', startToInputEnd);
        Transition backToStart = new Transition(startState, '0', "left");
        preStart.addTransition('0', backToStart);
        Transition startToOne = new Transition(stateOne, '1', "right");
        startState.addTransition('a', startToOne);
        Transition startToFinal = new Transition(finalState, '1', "right");
        startState.addTransition('0', startToFinal);
        Transition startLoop = new Transition(startState, '1', "left");
        startState.addTransition('1', startLoop);
        Transition oneToTwo = new Transition(stateTwo, '1', "right");
        stateOne.addTransition('0', oneToTwo);
        Transition twoToThree = new Transition(stateThree, '1', "right");
        stateTwo.addTransition('0', twoToThree);
        Transition threeToFour = new Transition(stateFour, '1', "right");
        stateThree.addTransition('0', threeToFour);
        Transition fourToFive = new Transition(stateFive, '1', "right");
        stateFour.addTransition('0', fourToFive);
        Transition fiveToSix = new Transition(stateSix, '1', "right");
        stateFive.addTransition('0', fiveToSix);
        Transition sixToSeven = new Transition(stateSeven, '1', "right");
        stateSix.addTransition('0', sixToSeven);
        Transition sevenToStart = new Transition(startState, '1', "left");
        stateSeven.addTransition('0', sevenToStart);
        


        // Define the Turing machine
        StateMachine turingMachine = new StateMachine("aa", preStart);
        turingMachine.addState(startState);
        turingMachine.addState(stateOne);
        turingMachine.addState(stateTwo);
        turingMachine.addState(stateThree);
        turingMachine.addState(stateFour);
        turingMachine.addState(stateFive);
        turingMachine.addState(stateSix);
        turingMachine.addState(stateSeven);
        turingMachine.addState(finalState);

        // Run the Turing machine
        turingMachine.run();

        // Output the result
        System.out.println(turingMachine.getOutput());
    }
}
