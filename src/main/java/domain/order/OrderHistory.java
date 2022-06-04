package domain.order;

import domain.bMember.BId;
import domain.bMember.BMemberName;
import domain.bMobileContract.BMobileContractNumber;
import domain.terminal.TerminalNameList;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderHistory {

    private final OrderHistoryId orderHistoryId;
    private final BMobileContractNumber bMobileContractNumber;
    private final BId bId;
    private final BMemberName bMemberName;
    private final TerminalNameList terminalNameList;
}
