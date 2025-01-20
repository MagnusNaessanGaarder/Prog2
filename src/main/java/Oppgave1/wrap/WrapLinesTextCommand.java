package Oppgave1.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end){
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Illegal Argument: Text cannot be null or empty");
    }

    String[] lines = text.split("\n");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < lines.length; i++) {
      sb.append(super.execute(lines[i]));
      if (!(i == lines.length - 1)) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }
}
