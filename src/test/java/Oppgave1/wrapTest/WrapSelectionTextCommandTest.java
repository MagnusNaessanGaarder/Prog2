package Oppgave1.wrapTest;

import static org.junit.jupiter.api.Assertions.*;

import Oppgave1.wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapSelectionTextCommandTest {

    private static String opening = "<b>";
    private static String end = "</b>";
    private static String selection = "test";
    private static WrapSelectionTextCommand wstc;

  @BeforeEach
  void setUp() {
    opening = "<b>";
    end = "</b>";
    selection = "test";
    wstc = new WrapSelectionTextCommand(opening, end, selection);
  }

  @AfterEach
  void tearDown() {
    wstc = null;
    opening = null;
    end = null;
    selection = null;
  }

  @Test
  void getSelection() {
    assertEquals("test", wstc.getSelection());
  }

  @Test
  void execute() {
    assertEquals("Dette er en <b>test</b>", wstc.execute("Dette er en test"));
  }
}