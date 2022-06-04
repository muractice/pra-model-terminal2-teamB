package domain.order;

import domain.bMember.BMember;

public interface OrderHistoryFactory {

    OrderHistory createOrderHistory(OrderApplication orderApplication, BMember bMember);
}
