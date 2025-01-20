package Oppgave1;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end){
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    String[] lines = text.split("\n");
    StringBuilder sb = new StringBuilder();
    for (String line : lines) {
      sb.append(super.execute(line));
      sb.append("\n");
    }
    return sb.toString();
  }
}
