public class Mtavroba {
  private static double biujeti;
  private Adamianebi adamiani;
  private boolean mravalshvilianiOjaxia;
  Mtavroba(double biujeti, Adamianebi adamiani, boolean mravalshvilianiOjaxia) {
    this.adamiani = adamiani;
    this.mravalshvilianiOjaxia = mravalshvilianiOjaxia;
    if (mravalshvilianiOjaxia) {
     this.biujeti =this.biujeti + adamiani.getXelfasi()*0.1;
    }
     this.biujeti = this.biujeti + adamiani.getXelfasi()*0.2;

  }

  public static double getBiujeti() {
    return biujeti;
  }

  public Adamianebi getAdamiani() {
    return adamiani;
  }

  public boolean isMravalshvilianiOjaxia() {
    return mravalshvilianiOjaxia;
  }
}
