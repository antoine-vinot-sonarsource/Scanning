package pokemon;

public class Bulbi {

  private String type;

  private int PV;

  public Bulbi(String type) {
    this.type = type;
  }

  public String getType() {
    System.out.println("Some changes");
    return type;
  }
}
