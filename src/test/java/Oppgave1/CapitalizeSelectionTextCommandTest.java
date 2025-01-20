package Oppgave1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CapitalizeSelectionTextCommandTest {

   private static String selection;
   private static CapitalizeSelectionTextCommand cstc;

  @BeforeEach
  void setUp() {
    selection = "test";
    cstc = new CapitalizeSelectionTextCommand(selection);
  }

  @AfterEach
  void tearDown() {
    selection = null;
    cstc = null;
  }

  @Test
  void execute() {
    String text = "this is a test";
    assertEquals("this is a Test", cstc.execute(text));
  }

  @Test
  void getSelection() {
    assertEquals(selection, cstc.getSelection());
  }
}