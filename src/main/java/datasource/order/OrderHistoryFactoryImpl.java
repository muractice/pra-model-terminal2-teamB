package datasource.order;

import domain.bMember.BId;
import domain.bMember.BMemberName;
import domain.bMobileContract.BMobileContractNumber;
import domain.order.OrderHistory;
import domain.order.OrderHistoryFactory;
import domain.order.OrderHistoryId;
import domain.terminal.TerminalNameList;
import org.springframework.stereotype.Component;

@Component
public class OrderHistoryFactoryImpl implements OrderHistoryFactory {

    @Override
    public OrderHistory createOrderHistory(BMobileContractNumber bMobileContractNumber, BId bId, BMemberName bMemberName, TerminalNameList terminalNameList) {

        //採番テーブルを利用する想定。今回は固定値
        int seqId = 1;

        return new OrderHistory(
                new OrderHistoryId(seqId),
                bMobileContractNumber,
                bId,
                bMemberName,
                terminalNameList
        );
    };
}
