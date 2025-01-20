package Oppgave1.capitalize;

public class CapitalizeWordsTextCommands extends CapitalizeTextCommand {
  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(word.substring(0, 1).toUpperCase());
      sb.append(word.substring(1));
      sb.append(" ");
    }
    return sb.toString().trim();
  }
}
