package domain.bMember;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BId {

    private final String value;

    public boolean hasMatched(BId bId) {
        return value.equals(bId.getValue());
    }
}
