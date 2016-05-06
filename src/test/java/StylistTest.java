import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StylistTest {

  @Test
  public void Stylist_instantiatesCorrectly_true() {
    Stylist newStylist = new Stylist("Trixy", 15);
    assertEquals(true, newStylist instanceof Stylist);
  }

  @Test
  public void getName_returnsName_String() {
    Stylist newStylist = new Stylist("Trixy", 15);
    assertEquals("Trixy", newStylist.getName());
  }

  @Test
  public void getRate_returnsRate_int() {
    Stylist newStylist = new Stylist("Trixy", 15);
    assertEquals(15, newStylist.getRate());
  }
}
