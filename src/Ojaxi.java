import java.util.ArrayList;
import java.util.Arrays;

public class Ojaxi {

  private ArrayList<Adamianebi> wevrebi = new ArrayList<>();
  double procenti;

  public ArrayList<Adamianebi> getWevrebi() {
    return wevrebi;
  }


  public Ojaxi(Adamianebi... wevrebi) {

    this.wevrebi = new ArrayList<>(Arrays.asList(wevrebi));

    int ojaxisArasrulwlovaniWevrebisRaodenoba = 0;

    for (int i = 0; i < wevrebi.length; i++) {
      if (getWevrebi().get(i).getAsaki() < 21) {
        ojaxisArasrulwlovaniWevrebisRaodenoba++;
      }
    }

//    while (true) {
//      var counter = 0;
//
//      // რამე ალგორითმი
//      // counter-ის მნიშვნელობა შეცვალე
//
//      if (counter == 10) {
//        break;
//      }
//    }

//    do {
//      // აგლორითმი
//    } while (true);
//

//    if (ojaxisArasrulwlovaniWevrebisRaodenoba > 2) {
//      procenti = Mtavroba.getProcentiMravalshvilianebistvis();
//    } else {
//      procenti = Mtavroba.getProcentiStandartuli();
//    }

    // ternary operator
    procenti = ojaxisArasrulwlovaniWevrebisRaodenoba > 2 ? Mtavroba.getProcentiMravalshvilianebistvis() : Mtavroba.getProcentiStandartuli();

    for (int i = 0; i < wevrebi.length; i++) {
      getWevrebi().get(i).gadaricxvaBiujetshi(procenti);
      System.out.println(getWevrebi().get(i).getSaxeli() + " " + getWevrebi().get(i).getGvari() + " " + getWevrebi().get(i).getXelfasi());
    }

  }

}