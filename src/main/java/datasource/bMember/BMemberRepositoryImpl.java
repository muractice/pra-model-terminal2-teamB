package datasource.bMember;

import domain.bMember.BId;
import domain.bMember.BMember;
import domain.bMember.BMemberRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BMemberRepositoryImpl implements BMemberRepository {

    @Override
    public Optional<BMember> findById(BId bid){
        return Optional.empty();
    }
}
