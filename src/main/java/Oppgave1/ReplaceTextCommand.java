package Oppgave1;

import TextCommand;

class replaceTextCommand implements TextCommand {
    protected String target;
    protected String replacement;

    public replaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    public void replaceTextCommand() {
        textDocument.replaceText(text, newText);
    }

    public void undo() {
        textDocument.replaceText(newText, text);
    }
}