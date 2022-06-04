package domain.bMobileContract;

import java.util.Optional;

public interface BMobileContractRepository {

    Optional<BMobileContract> findById(BMobileContractNumber bMobileContractNumber);
}
