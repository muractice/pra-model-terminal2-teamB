package domain;

import domain.Bid;

public class BMember {
    private final Bid bid;
    private final MemberName memberName;

    BMember(Bid bid, MemberName memberName){
        this.bid = bid;
        this.memberName = memberName;
    }

}
