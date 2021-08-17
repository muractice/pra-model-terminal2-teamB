package domain;

public class NumberOfLineContract {
    private final int value;

    public NumberOfLineContract(int value) {
        this.value = value;
    }

    public boolean greaterThan(NumberOfTerminal numberOfTerminal){
        return value > numberOfTerminal.getValue();
    }
}
