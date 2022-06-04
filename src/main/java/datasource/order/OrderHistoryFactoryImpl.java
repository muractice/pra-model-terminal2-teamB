package datasource.order;

import domain.bMember.BMember;
import domain.order.OrderApplication;
import domain.order.OrderHistory;
import domain.order.OrderHistoryFactory;
import domain.order.OrderHistoryId;
import org.springframework.stereotype.Component;

@Component
public class OrderHistoryFactoryImpl implements OrderHistoryFactory {

    @Override
    public OrderHistory createOrderHistory(OrderApplication orderApplication, BMember bMember) {

        //採番テーブルを利用する想定。今回は固定値
        int seqId = 1;

        return new OrderHistory(
                new OrderHistoryId(seqId),
                orderApplication.getBMobileContractNumber(),
                bMember.getBId(),
                bMember.getBMemberName(),
                orderApplication.getTerminalList().createTerminalNameList()
        );
    };
}
