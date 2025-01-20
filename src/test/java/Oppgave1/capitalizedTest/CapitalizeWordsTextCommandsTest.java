package Oppgave1.capitalizedTest;

import static org.junit.jupiter.api.Assertions.*;

import Oppgave1.capitalize.CapitalizeWordsTextCommands;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CapitalizeWordsTextCommandsTest {
  private static CapitalizeWordsTextCommands cwtc;

  @BeforeEach
  void setUp() {
    cwtc = new CapitalizeWordsTextCommands();
  }

  @AfterEach
  void tearDown() {
    cwtc = null;
  }

  @Test
  void execute() {
    assertEquals("Hello World", cwtc.execute("hello world"));
  }
}