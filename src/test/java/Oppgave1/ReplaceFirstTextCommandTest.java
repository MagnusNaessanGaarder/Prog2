package Oppgave1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReplaceFirstTextCommandTest {

  private static ReplaceFirstTextCommand rftc;

  @BeforeAll
  public static void setUpBeforeClass() {
      rftc = new ReplaceFirstTextCommand("dame", "mann");
  }

  @AfterAll
  public static void tearDownAfterClass() {
      rftc = null;
  }

  @Test
  void execute() {
    assertEquals("Morra di er mann. Morra di er dame!", rftc.execute("Morra di er dame. Morra di er dame!"));
  }
}