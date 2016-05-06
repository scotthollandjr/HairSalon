import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Stylist {
  private int id;
  private String name;
  private int rate;
  private List<String> days;
  private List<Client> clientList;

  public Stylist(String name, int rate) {
    this.name = name;
    this.rate = rate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getRate() {
    return rate;
  }
}
