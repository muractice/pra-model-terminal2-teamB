package domain.bMember;

import java.util.Optional;

public interface BMemberRepository {

    Optional<BMember> findById(BId bid);
}
