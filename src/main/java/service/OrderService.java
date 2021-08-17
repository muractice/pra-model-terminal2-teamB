package service;

import domain.*;


public class OrderService {
    MemberRepository memberRepository;
    BMobileContractRepository bMobileContractRepository;

    void order(Bid bid,
              BMobileContractNumber bMobileContractNumber,
              TerminalList terminalList){

        BMember bMember = memberRepository.findById(bid);
        BMobileContract bMobileContract = bMobileContractRepository.findById(bMobileContractNumber);

        if( !(bMobileContract.acceptable(terminalList) && bMobileContract.isContract()) );

    }
}
