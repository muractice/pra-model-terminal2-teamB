package domain;

import java.util.ArrayList;
import java.util.List;

public class BMobileContract {
    private final BMobileContractNumber bMobileContractNumber;
    private final List<LineContract> lineContracts;

    public BMobileContract(BMobileContractNumber bMobileContractNumber, List<LineContract> lineContracts){
        this.bMobileContractNumber = bMobileContractNumber;
        this.lineContracts = lineContracts;
    }

    public NumberOfLineContract getNumberOfLineContract(){
        return new NumberOfLineContract(lineContracts.size());
    }

}
