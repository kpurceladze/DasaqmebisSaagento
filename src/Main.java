import java.util.ArrayList;
import java.util.Collections;

public class Main {



    public static void main(String[] args) {
        Kompania artcafe = new Kompania("არტ-კაფე", "ვ. დოლიძის ქუჩა, კორპუსი 29, ბინა 70, აივანი", 700);
        Kompania sinqronuliTargmani = new Kompania("სინქრონული თარგმანი", "ვ. დოლიძის ქუჩა, კორპუსი 29, ბინა 113", 7000);
        Kompania musikisSamyaro = new Kompania("მუსიკის სამყარო", "თორნიკე ერისთავის 58", 1200);
        Kompania sasaciloBanki = new Kompania("სასაცილო ბანკი", "ზაქარია ფალიაშვილის 80", 556.32);
        Kompania saxelosno = new Kompania("სახელოსნო", "ფანასკერტელის 24",2000);



       Adamianebi qetevanFurtseladze = new Adamianebi("ფურცელაძე", "ქეთევან",  58,  true, artcafe, 2000);
       Adamianebi eleneTsibadze = new Adamianebi("ციბაძე",      "ელენე",   31,   true, musikisSamyaro,    11000);
       Adamianebi salomeJafiashvili = new Adamianebi("ჯაფიაშვილი", "სალომე",  33,  true, sinqronuliTargmani, 10000);
       Adamianebi tengizJafiashvili = new Adamianebi("ჯაფიაშვილი", "თენგიზ",  66,  true, artcafe,            5000);
       Adamianebi tornikeJafiashvili = new Adamianebi("ჯაფიაშვილი", "თორნიკე", 27,  true, musikisSamyaro,     10000);
       Adamianebi giorgiJafiashvili = new Adamianebi("ჯაფიაშვილი", "გიორგი",  30,   true, musikisSamyaro,    11000);
       Adamianebi davitSanaia = new Adamianebi("სანაია",       "დავით",   51,  true, saxelosno,          7000);
       Adamianebi ninoMaisuradze = new Adamianebi("მაისურაძე",   "ნინო",     43,  true,  saxelosno,        6500);
       Adamianebi gabrielSanaia = new Adamianebi("სანაია",       "გაბრიელ", 20,  false, null,    0);
       Adamianebi giorgiSanaia = new Adamianebi("სანაია",       "გიორგი",  18,  false, null,    0);
       Adamianebi andriaSanaia = new Adamianebi("სანაია",       "ანდრია",  8,    false, null,   0);

        Adamianebi[] moqalaqeebi = {
            qetevanFurtseladze,
            eleneTsibadze,
            salomeJafiashvili,
            tengizJafiashvili,
            tornikeJafiashvili,
            giorgiJafiashvili,
            davitSanaia,
            ninoMaisuradze,
            gabrielSanaia,
            giorgiSanaia,
            andriaSanaia};

        ArrayList<Adamianebi> ojaxi_1 = new ArrayList<>();
       ArrayList<Adamianebi> ojaxi_2 = new ArrayList<>();
        ArrayList<Adamianebi> ojaxi_3 = new ArrayList<>();
        ArrayList<Adamianebi> ojaxi_4 = new ArrayList<>();
    boolean mravalshvilianiOjaxia = false ;

      Collections.addAll(ojaxi_1, qetevanFurtseladze,tengizJafiashvili,tornikeJafiashvili);
        Collections.addAll(ojaxi_2, eleneTsibadze,  giorgiJafiashvili);
          Collections.addAll(ojaxi_3, salomeJafiashvili);
              Collections.addAll(ojaxi_4, davitSanaia, ninoMaisuradze, gabrielSanaia, giorgiSanaia, andriaSanaia);
int k = 0;
      ArrayList<ArrayList<Adamianebi>> ojaxi = new ArrayList<>();
      Collections.addAll(ojaxi, ojaxi_1, ojaxi_2, ojaxi_3, ojaxi_4);
     for (int j = 0; j < ojaxi.size(); j++) {

        for (int i = 0; i <  ojaxi.get(j).size(); i++) {


          if (ojaxi.get(j).get(i).getAsaki() < 21) {
            k++;
            System.out.println(ojaxi.get(j).get(i).getAsaki());
          }
        }
       if (k >= 3) {
         mravalshvilianiOjaxia = true;
System.out.println(k);
       }
            new Ojaxi((ojaxi.get(j)), mravalshvilianiOjaxia);
       for (int i = 0; i< ojaxi.get(j).size(); i++) {



         new Mtavroba(Mtavroba.getBiujeti(), ojaxi.get(j).get(i), mravalshvilianiOjaxia);
         System.out.println(Mtavroba.getBiujeti()+" "+ ojaxi.get(j).get(i).getSaxeli()+" "+mravalshvilianiOjaxia);
       }
         System.out.println(Mtavroba.getBiujeti());
       }







//      Ojaxi [] ojaxebi = { new Ojaxi(ojaxi_1, mravalshvilianiOjaxia),
//                         new Ojaxi(ojaxi_2, mravalshvilianiOjaxia),
//                         new Ojaxi(ojaxi_3,mravalshvilianiOjaxia),
//                         new Ojaxi(ojaxi_4,mravalshvilianiOjaxia) };


        System.out.println("დასაქმებულების საშუალო ხელფასია: "+Adamianebi.getSashualoXelfasi()+" ლარი.");

        Kompania[] kompaniebi =
            {artcafe, sinqronuliTargmani, sasaciloBanki, musikisSamyaro, saxelosno};

    Kompania.kompaniisSashualoXelfasi(kompaniebi, moqalaqeebi);
   // Ojaxi.ragaca(ojaxebi);
    }

}
