package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class Pikachu extends Pokemon {

  public Pikachu(String name, String type, int level) {
    super(name, type, level);
  }

  public void attack() {
    System.out.println("Pikachu attack!");
  }

  private static PreparedStatement createStatement(String projectUuid, Collection<String> dispatcherKeys, Connection connection) throws SQLException {
    String sql =
      "SELECT count(1) FROM properties pp " +
        "where pp.user_uuid is not null and (pp.entity_uuid is null or pp.entity_uuid=?) ";
    PreparedStatement res = connection.prepareStatement(sql);
    res.setString(1, projectUuid);
    int index = 2;
    for (String dispatcherKey : dispatcherKeys) {
      res.setString(index, "PREFIX" + dispatcherKey + ".%");
      index++;
    }
    return res;
  }

  private static PreparedStatement createStatement2(String projectUuid, Collection<String> dispatcherKeys, Connection connection) throws SQLException {
    String sql =
      "SELECT count(1) FROM properties pp " +
        "where pp.user_uuid is not null and (pp.entity_uuid is null or pp.entity_uuid=?) ";
    PreparedStatement res = connection.prepareStatement(sql);
    res.setString(1, projectUuid);
    int index = 2;
    for (String dispatcherKey : dispatcherKeys) {
      res.setString(index, "PREFIX" + dispatcherKey + ".%");
      index++;
    }
    return res;
  }
}
