package week4.task1;

 class quatao extends quacam {
  private   String phanloai;
//phân biệt to nhỏ
     public void quatao(){};
    public void quatao(String ten,String nguongoc,int ngaynhap,String phanloai)
    {
        setTen(ten);
        setNguongoc(nguongoc);
        setNgaynhap(ngaynhap);
        this.phanloai=phanloai;
    }
    public String getPhanloai() {
        return phanloai;
    }
    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }
    public void giatri()
    {
        if(getPhanloai()=="nhỏ")
        {
            setGiaban(10);
            System.out.println(getGiaban());
        }
        else if(getPhanloai()=="to")
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
