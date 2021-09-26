package domain.terminal;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class TerminalList {

    private final List<Terminal> terminalList;

    public NumberOfTerminal getNumberOfTerminal(){
        return new NumberOfTerminal(terminalList.size());
    }

    public TerminalNameList createTerminalNameList() {
        return new TerminalNameList(
                terminalList
                        .stream()
                        .map(Terminal::getTerminalName)
                        .collect(Collectors.toList()));
    }
}
