import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StylistTest {

  @Test
  public void Stylist_instantiatesCorrectly_true() {
    Stylist newStylist = new Stylist("Trixy", 15);
    assertEquals(true, newStylist instanceof Stylist);
  }
}
