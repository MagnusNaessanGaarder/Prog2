package Oppgave1.capitalizedTest;

import static org.junit.jupiter.api.Assertions.*;

import Oppgave1.capitalize.CapitalizeTextCommand;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CapitalizeTextCommandTest {

  private static CapitalizeTextCommand ctc;

  @BeforeEach
  void setUp() {
    ctc = new CapitalizeTextCommand();
  }

  @AfterEach
  void tearDown() {
    ctc = null;
  }

  @Test
  void execute() {
    assertEquals("Hello dette er en setning", ctc.execute("hello dette er en setning"));
  }
}