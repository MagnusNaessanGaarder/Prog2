package Oppgave1.view;

import Oppgave1.TextCommand;
import java.util.ArrayList;
import java.util.List;

public class Script implements TextCommand {
  private final List<TextCommand> textCommands;

  public Script(List<TextCommand> textCommands) {
      this.textCommands = new ArrayList<>(textCommands);
  }

  @Override
  public String execute(String text) {
      for (TextCommand command : textCommands) {
          try {
              text = command.execute(text);
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
      return text;
  }
}
