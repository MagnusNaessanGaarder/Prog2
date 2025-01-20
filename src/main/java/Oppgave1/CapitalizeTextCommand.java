package Oppgave1;

public class CapitalizeTextCommand implements TextCommand {
  @Override
  public String execute(String text) {
    text = text.trim();
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
