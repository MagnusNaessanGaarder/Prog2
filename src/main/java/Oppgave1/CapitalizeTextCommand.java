package Oppgave1;

public class CapitalizeTextCommand implements TextCommand {
  @Override
  public String execute(String text) {
    return text.toUpperCase();
  }
}
