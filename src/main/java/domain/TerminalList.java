package domain;

import java.util.List;

public class TerminalList {
    private final List<Terminal> terminalList;

    TerminalList(List<Terminal> terminalLists){
        this.terminalList = terminalLists;
    }

    public NumberOfTerminal getNumberOfTerminal(){
        return new NumberOfTerminal(terminalList.size());
    }
}
