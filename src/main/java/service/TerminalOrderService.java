package service;

import domain.bMember.BMember;
import domain.bMember.BMemberRepository;
import domain.bMobileContract.BMobileContract;
import domain.bMobileContract.BMobileContractRepository;
import domain.order.OrderApplication;
import domain.order.OrderHistory;
import domain.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TerminalOrderService {

    @Autowired
    private BMemberRepository bMemberRepository;
    @Autowired
    private BMobileContractRepository bMobileContractRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public void order(OrderApplication orderApplication) throws Exception {

        BMember bMember = bMemberRepository
                .findById(orderApplication.getBId())
                .orElseThrow(Exception::new);

        BMobileContract bMobileContract = bMobileContractRepository
                .findById(orderApplication.getBMobileContractNumber())
                .orElseThrow(Exception::new);

        if(bMobileContract.unacceptable(orderApplication.getBId(), orderApplication.getTerminalList())) {
            throw new Exception("お申込できません。");
        }

        orderRepository.save(
                new OrderHistory(
                        orderApplication.getBMobileContractNumber(),
                        bMember.getBMemberName(),
                        orderApplication
                                .getTerminalList()
                                .createTerminalNameList()
                )
        );
    }
}
