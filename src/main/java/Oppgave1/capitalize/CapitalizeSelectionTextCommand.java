package Oppgave1.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.trim().replace(selection, super.execute(selection));
  }

  public String getSelection() {
    return selection;
  }
}
