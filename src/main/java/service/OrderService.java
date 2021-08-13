package service;

import domain.*;


public class OrderService {
    MemberRepository memberRepository;
    BMobileContractRepository bMobileContractRepository;

    void ordr(Bid bid,
              BMobileContractNumber bMobileContractNumber,
              TerminalList terminalList){

    BMember bMember = memberRepository.findById(bid);
    BMobileContract bMobileContract = bMobileContractRepository.findById(bMobileContractNumber);

    NumberOfLineContract numberOfLineContract = bMobileContract.getNumberOfLineContract();
    NumberOfTerminal num3berOfTerminal = terminalList.getNumberOfTerminal();

    }

}
