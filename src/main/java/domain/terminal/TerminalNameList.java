package domain.terminal;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class TerminalNameList {

    private final List<TerminalName> terminalList;
}
