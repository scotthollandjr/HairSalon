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

  public static List<Stylist> all() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM stylists";
      return con.createQuery(sql).executeAndFetch(Stylist.class);
    }
  }

  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO stylists(name, rate) VALUES (:name, :rate);";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("name", this.name)
        .addParameter("rate", this.rate)
        .executeUpdate()
        .getKey();
    }
  }
}
