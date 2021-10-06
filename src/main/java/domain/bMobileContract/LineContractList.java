package domain.bMobileContract;

import domain.terminal.NumberOfTerminal;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class LineContractList {

    private final List<LineContract> lineContracts;

    boolean hasEnoughLineContract(NumberOfTerminal numberOfTerminal) {
        return getNumberOfLineContract().greaterEqual(numberOfTerminal);
    }

    private NumberOfLineContract getNumberOfLineContract(){
        return new NumberOfLineContract(lineContracts.size());
    }
}
