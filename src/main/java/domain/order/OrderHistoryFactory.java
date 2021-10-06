package domain.order;

import domain.bMember.BId;
import domain.bMember.BMemberName;
import domain.bMobileContract.BMobileContractNumber;
import domain.terminal.TerminalNameList;

public interface OrderHistoryFactory {

    OrderHistory createOrderHistory(BMobileContractNumber bMobileContractNumber, BId bId, BMemberName bMemberName, TerminalNameList terminalNameList);
}
