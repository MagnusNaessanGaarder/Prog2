package Oppgave1.replace;

import Oppgave1.TextCommand;

public class ReplaceTextCommand implements TextCommand {
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
    public String execute(String text) throws Exception {
        try{
            return text.replace(target, replacement);
        } catch (Exception e) {
            throw new Exception("No such word as " + target + " in text: " + e.getMessage());
        }
    }
}