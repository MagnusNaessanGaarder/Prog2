package Oppgave1;

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
      return text.replace(selection, super.execute(selection));
  }
}
