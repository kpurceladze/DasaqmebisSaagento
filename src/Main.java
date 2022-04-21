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

    var ojaxiSanaia = new Ojaxi(davitSanaia, ninoMaisuradze, gabrielSanaia, giorgiSanaia, andriaSanaia);
    var ojaxiJafiashviliPurceladze = new Ojaxi(tengizJafiashvili, qetevanFurtseladze, tornikeJafiashvili);
    var ojaxiJafiashviliCibadze = new Ojaxi(giorgiJafiashvili, eleneTsibadze);
    var ojaxiJafiashvili = new Ojaxi(salomeJafiashvili);

    System.out.println(Mtavroba.getBiujeti());


    }

}
