package datasource.bMobileContract;

import domain.bMobileContract.BMobileContract;
import domain.bMobileContract.BMobileContractNumber;
import domain.bMobileContract.BMobileContractRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BMobileContractRepositoryImpl implements BMobileContractRepository {

    @Override
    public Optional<BMobileContract> findById(BMobileContractNumber bMobileContractNumber) {
        return Optional.empty();
    }
}
