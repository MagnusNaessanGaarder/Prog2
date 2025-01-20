package Oppgave1.wrapTest;

import static org.junit.jupiter.api.Assertions.*;

import Oppgave1.wrap.WrapTextCommand;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapTextCommandTest {
  private static String opening = "<b>";
  private static String end = "</b>";

  private static WrapTextCommand wtc;


  @BeforeEach
  void setUp() {
    opening = "<b>";
    end = "</b>";
    wtc = new WrapTextCommand(opening, end);
  }

  @AfterEach
  void tearDown() {
    wtc = null;
    opening = null;
    end = null;
  }

  @Test
  void getOpening() {
    assertEquals("<b>", wtc.getOpening());
  }

  @Test
  void getEnd() {
    assertEquals("</b>", wtc.getEnd());
  }

  @Test
  void execute() {
    assertEquals("<b>test</b>", wtc.execute("test"));
  }
}