package Oppgave1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WrapLinesTextCommandTest {
  private static String opening = "<b>";
  private static String end = "</b>";
  private static WrapLinesTextCommand wltc;

  @BeforeEach
  void setUp() {
    opening = "<b>";
    end = "</b>";
    wltc = new WrapLinesTextCommand(opening, end);
  }

  @AfterEach
  void tearDown() {
      wltc = null;
      opening = null;
      end = null;
  }

  @Test
  void execute() {
    assertEquals("<b>test</b>\n<b>test</b>", wltc.execute("test\ntest"));
  }
}