public class Kompania {
  private String kompaniisSaxeli;
  private String misamarti;
  private double minimaluriXelfasi;




  Kompania (String kompaniisSaxeli, String misamarti, double minimaluriXelfasi) {
    this.kompaniisSaxeli = kompaniisSaxeli;
    this.misamarti = misamarti;
    this.minimaluriXelfasi = minimaluriXelfasi;



  }


  public String getKompaniisSaxeli() {
    return kompaniisSaxeli;
  }
  public String getMisamarti() {
    return misamarti;
  }
  public double getMinimaluriXelfasi() {
    return minimaluriXelfasi;
  }

public static void kompaniisSashualoXelfasi(Kompania kompaniebi[], Adamianebi tanamshromlebi[]) {

  double jami =  0;
  int k = 0;
        for (int i = 0; i < kompaniebi.length; i++) {
    System.out.println();

    System.out.println((i+1)+"    "+kompaniebi[i].getKompaniisSaxeli());
    for (int j = 0; j < tanamshromlebi.length; j++) {
      if(kompaniebi[i].getKompaniisSaxeli().equals(tanamshromlebi[j].getKompania().getKompaniisSaxeli())) {
        System.out.println(tanamshromlebi[j].getSaxeli() + " "+ tanamshromlebi[j].getGvari());
        jami = jami + tanamshromlebi[j].getXelfasi();
        k++;
      }
    }

    if(k == 0) {
      System.out.println(kompaniebi[i].getKompaniisSaxeli()+"-ს თანამშრომლები არ ჰყავს");
                };
   // System.out.println(jami);
    System.out.println("        '" + kompaniebi[i].getKompaniisSaxeli() + "ს' საშუალო ხელფასია: " + jami/k + " ლარი.");

    jami = 0;
    k = 0;
        }
              }
}