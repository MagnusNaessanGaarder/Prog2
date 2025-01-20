package Oppgave1.view;

import static org.junit.jupiter.api.Assertions.*;

import Oppgave1.TextCommand;
import Oppgave1.capitalize.CapitalizeSelectionTextCommand;
import Oppgave1.replace.ReplaceFirstTextCommand;
import Oppgave1.wrap.WrapLinesTextCommand;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScriptTest {
  private static List<TextCommand> commands;
  private static Script pipeline;
  private static CapitalizeSelectionTextCommand cstc;
  private static ReplaceFirstTextCommand rftc;
  private static WrapLinesTextCommand wltc;

  private static String text;

  @BeforeEach
  void setUp() {
    commands = new ArrayList<>();
    cstc = new CapitalizeSelectionTextCommand("test");
    rftc = new ReplaceFirstTextCommand("scriptet", "koden");
    wltc = new WrapLinesTextCommand("<b>", "</b>");

    commands.add(cstc);
    commands.add(rftc);
    commands.add(wltc);

    pipeline = new Script(commands);
    text = """
           Dette er en testtekst
      som skal brukes til å teste
      at scriptet fungerer som det skal.
      Da får vi se hva som skjer.   """;
  }

  @AfterEach
  void tearDown() {
    commands = null;
    cstc = null;
    rftc = null;
    wltc = null;
    pipeline = null;
    text = null;
  }

  @Test
  void execute() {
    String expected = """
                      <b>Dette er en Testtekst</b>
                      <b>som skal brukes til å Teste</b>
                      <b>at koden fungerer som det skal.</b>
                      <b>Da får vi se hva som skjer.</b>""";
    assertEquals(expected, pipeline.execute(text));
  }
}