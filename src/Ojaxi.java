import java.util.ArrayList;

public class Ojaxi {

  private ArrayList<Adamianebi> wevrebi;
  private boolean mravalshvilianiOjaxia ;

  public Ojaxi(ArrayList<Adamianebi> wevrebi, boolean mravalshvilianiOjaxia) {
    this.wevrebi = wevrebi;
    this.mravalshvilianiOjaxia = mravalshvilianiOjaxia;

   if (mravalshvilianiOjaxia) {

     System.out.println("მრავალშვილიანი ოჯახია");
     for (int i = 0; i < wevrebi.size(); i++) {


       System.out.println(wevrebi.get(i).getSaxeli() + " " + wevrebi.size());
     }
   }
   else {
    System.out.println(wevrebi.get(0).getSaxeli() + " " + wevrebi.size());

   }
  }





//  public static void ragaca(Ojaxi[] ojaxebi) {
//    //int k = 0;
//    for (Ojaxi ojaxi : ojaxebi) {
//      System.out.println("---------------------------");
//
//      for (int j = 0; j < ojaxi.wevrebi.size(); j++) {
//        if (ojaxi.wevrebi.get(j).getAsaki() < 21) {
//         // k++;
//
//        }
//
//         // System.out.println(ojaxi.wevrebi.get(j).getSaxeli()+" "+k);
//
//      }
//    }
//  }
}