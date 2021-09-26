package domain.bMobileContract;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class LineContractList {

    private final List<LineContract> lineContracts;

    public NumberOfLineContract getNumberOfLineContract(){
        return new NumberOfLineContract(lineContracts.size());
    }
}
