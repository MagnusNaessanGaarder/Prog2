package Oppgave1;

public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  public WrapTextCommand(String opening) {
    this.opening = opening;
    this.end = opening;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Illegal Argument: Text cannot be null or empty");
    }
    return opening + text + end;
  }
}
