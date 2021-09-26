package domain.bMobileContract;

import domain.terminal.NumberOfTerminal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NumberOfLineContract {

    private final int value;

    boolean greaterEqual(NumberOfTerminal numberOfTerminal){
        return value >= numberOfTerminal.getValue();
    }
}
