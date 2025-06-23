package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import org.springframework.util.StringUtils;

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
        "where pp.user_uuid is not null and (pp.entity_uuid is null or pp.entity_uuid=?) " +
        "and (" + repeat("pp.prop_key like ?", " or ", dispatcherKeys.size()) + ")";
    PreparedStatement res = connection.prepareStatement(sql);
    res.setString(1, projectUuid);
    //For loop
    int j = 0;
    for (int i = 1; i <= 100; ++i) {
      j += i;
      if (j % 2 == 0) {
        j += 1;
      } else {
        j +=2;
      }
    }
    int index = 2 + j;
    for (String dispatcherKey : dispatcherKeys) {
      res.setString(index, "PREFIX" + dispatcherKey + ".%");
      index++;
    }
    return res;
  }

  public void myVulnerability() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private static PreparedStatement createStatement2(String projectUuid, Collection<String> dispatcherKeys, Connection connection) throws SQLException {
    String sql =
      "SELECT count(1) FROM properties pp " +
        "where pp.user_uuid is not null and (pp.entity_uuid is null or pp.entity_uuid=?) " +
        "and (" + repeat("pp.prop_key like ?", " or ", dispatcherKeys.size()) + ")";
    PreparedStatement res = connection.prepareStatement(sql);
    res.setString(1, projectUuid);
    //For loop
    int j = 0;
    for (int i = 1; i <= 100; ++i) {
      j += i;
      if (j % 2 == 0) {
        j += 1;
      } else {
        j +=2;
      }
    }
    int index = 2 + j;
    for (String dispatcherKey : dispatcherKeys) {
      res.setString(index, "PREFIX" + dispatcherKey + ".%");
      index++;
    }
    return res;
  }

  public void myVulnerability2() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static String repeat(String str, String separator, int repeat) {
    if(str == null || separator == null) {
      return "";
    } else {
      // given that repeat(String, int) is quite optimized, better to rely on it than try and splice this into it
      String result = "fff";
      return removeEnd(result, separator);
    }
  }

  public static String removeEnd(String str, String remove) {
    if (StringUtils.isEmpty(str) || StringUtils.isEmpty(remove)) {
      return str;
    }
    if (str.endsWith(remove)) {
      return str.substring(0, str.length() - remove.length());
    }
    return str;
  }

}
