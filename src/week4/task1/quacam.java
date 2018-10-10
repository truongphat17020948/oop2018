package week4.task1;

public class quacam extends hoaqua {
  private   String nguongoc;
public void quacam(){};
public void quacam(String ten,String nguongoc,int ngaynhap)
{
    setTen(ten);
   this.nguongoc=nguongoc;
   this.ngaynhap = ngaynhap;
}
    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
    int ngaynhap;

    public int getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(int ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

}
