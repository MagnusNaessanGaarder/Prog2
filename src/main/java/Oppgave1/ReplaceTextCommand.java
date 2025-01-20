package Oppgave1;

class ReplaceTextCommand implements TextCommand {
    protected String target;
    protected String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }

    @Override
    public String execute(String text) {
        return "";
    }
}