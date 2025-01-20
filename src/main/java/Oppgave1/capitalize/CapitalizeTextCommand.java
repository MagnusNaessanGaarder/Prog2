package Oppgave1.capitalize;

import Oppgave1.TextCommand;

public class CapitalizeTextCommand implements TextCommand {
  @Override
  public String execute(String text) {
    text = text.trim();
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
