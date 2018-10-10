package week4.task1;

public class camsanh extends quacamphong {
    String vi;
//thể hiện vị của quả cam
    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }
    public void danhgia()
    {
        if(getVi()=="chua")
        {
            System.out.println("không ngon");
        }
        else if(getVi()=="ngọt")
        {
            System.out.println("ngon");
        }
        else {
            System.out.println("ăn tạm");
        }
    }
}
