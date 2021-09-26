package domain.bMember;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BMember {

    private final BId bId;
    private final BMemberName BMemberName;

    public boolean hasMatchedBId(BId bId) {
        return this.bId.hasMatched(bId);
    }
}
