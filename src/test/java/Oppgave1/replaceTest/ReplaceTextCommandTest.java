package Oppgave1.replaceTest;

import static org.junit.jupiter.api.Assertions.*;

import Oppgave1.replace.ReplaceTextCommand;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReplaceTextCommandTest {
  private static ReplaceTextCommand rtc;


  @BeforeAll
  public static void setUpBeforeClass() {
    rtc = new ReplaceTextCommand("a", "b");
  }

  @AfterAll
  public static void tearDownAfterClass() {
      rtc = null;
  }

  @Test
  void getTarget() {
    rtc = new ReplaceTextCommand("a", "b");
    assertEquals("a", rtc.getTarget());
  }

  @Test
  void getReplacement() {
    rtc = new ReplaceTextCommand("a", "b");
    assertEquals("b", rtc.getReplacement());
  }

  @Test
  void execute() throws Exception {
    String text = "abba er en bra gruppe med mange bra sanger";
    String kontroll = "bbbb er en brb gruppe med mbnge brb sbnger";

   rtc = new ReplaceTextCommand("a", "b");
    assertEquals(kontroll, rtc.execute(text));
  }
}