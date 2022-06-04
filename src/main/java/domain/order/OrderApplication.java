package domain.order;

import domain.bMember.BId;
import domain.bMobileContract.BMobileContractNumber;
import domain.terminal.TerminalList;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderApplication {

    private final BId bId;
    private final BMobileContractNumber bMobileContractNumber;
    private final TerminalList terminalList;
}
