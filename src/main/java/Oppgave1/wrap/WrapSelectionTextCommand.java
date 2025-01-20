package Oppgave1.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
      super(opening, end);
      this.selection = selection;
  }

  public String getSelection() {
      return selection;
  }

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Illegal Argument: Text cannot be null or empty");
    }
    return text.replace(selection, super.execute(selection));
  }
}
