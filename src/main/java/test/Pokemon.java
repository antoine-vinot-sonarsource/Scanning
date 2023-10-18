package test;

public abstract class Pokemon {
  private String name;
  private String type;
  private int level;

  public Pokemon(String name, String type, int level) {
    this.name = name;
    this.type = type;
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getLevel() {
    return level;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String toString() {
    return "Pokemon: " + name + " " + type + " " + level;
  }
}
