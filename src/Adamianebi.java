import java.util.ArrayList;

public class Adamianebi {
  private String saxeli;
  private String gvari;
  private int asaki;
  private double xelfasi;
  private Kompania kompania;
  private static int mtvleli;
  private static double xelfasebisJami;
  private static double minimalurixelfasebikompaniidan = 0;
  private static boolean dasaqmebulia;
  private static ArrayList<Adamianebi> adamianebi = new ArrayList<>();

  public String getSaxeli() {
    return saxeli;
  }

  public String getGvari() {
    return gvari;
  }

  public Kompania getKompania() {
    return kompania;
  }

  public int getAsaki() {
    return asaki;
  }

  public double getXelfasi() {
    return xelfasi;
  }

  public static double getSashualoXelfasi() {
    return xelfasebisJami / mtvleli;
  }

  public static double getMinimalurixelfasebikompaniidan() {
    return minimalurixelfasebikompaniidan / mtvleli;
  }

  public static boolean isDasaqmebulia() {
    return dasaqmebulia;
  }

  public static double kompaniisSashualoXelfasi(Kompania kompania) {
    int counter = 0;
    double sum = 0;

    for (Adamianebi adamiani : Adamianebi.adamianebi) {
      if (adamiani.kompania.getKompaniisSaxeli().equals(kompania.getKompaniisSaxeli())) {
        counter++;
        sum += adamiani.xelfasi;
      }
    }

    return sum / counter;
  }

  public void gadaricxvaBiujetshi(double procenti) {
    var sheamcireXelfasi = procenti * xelfasi/ 100;

    xelfasi -= sheamcireXelfasi;
    Mtavroba.gazardeBiujeti(sheamcireXelfasi);
  }

  Adamianebi(String gvari, String saxeli, int asaki, boolean dasaqmebulia, Kompania kompania, double xelfasi) {
    this.saxeli = saxeli;
    this.gvari = gvari;
    this.asaki = asaki;
    this.xelfasi = xelfasi;

    if (!(dasaqmebulia)) {

      this.kompania = new Kompania("", "", 0);
    } else {
      this.kompania = kompania;


      if (kompania != null) {
        mtvleli++;
        xelfasebisJami += xelfasi;
        minimalurixelfasebikompaniidan += kompania.getMinimaluriXelfasi();

        Adamianebi.adamianebi.add(this);


      }

    }
  }
}