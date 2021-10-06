package domain.bMobileContract;

import domain.bMember.BMember;
import domain.bMember.BId;
import domain.terminal.TerminalList;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BMobileContract {

    private final BMobileContractNumber bMobileContractNumber;
    private final BMember bMember;
    private final LineContractList lineContractList;

    private boolean acceptable(BId bId, TerminalList terminalList) {
        return isMatched(bId) && hasEnoughLineContract(terminalList);
    }

    public boolean unacceptable(BId bId, TerminalList terminalList) {
        return !acceptable(bId, terminalList);
    }

    private boolean isMatched(BId bId) {
        return bMember.hasMatchedBId(bId);
    }

    private boolean hasEnoughLineContract(TerminalList terminalList){
        return lineContractList.hasEnoughLineContract(terminalList.getNumberOfTerminal());
    }
}
