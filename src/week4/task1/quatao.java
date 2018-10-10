package week4.task1;

public class quatao extends quacam {
  private   String phanloai;
//phân biệt táo tàu và táo mĩ
    public String getPhanloai() {
        return phanloai;
    }
    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }
    public void giatri()
    {
        if(getPhanloai()=="táo tàu")
        {
            setGiaban(10);
            System.out.println(getGiaban());
        }
        else if(getPhanloai()=="táo mĩ")
        {
            setGiaban(100);
            System.out.println(getGiaban());
        }
        else
        {
            System.out.println("giá dao động từ 10->100");
        }
    }
}
