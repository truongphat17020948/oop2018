package week4.task1;

 class quacamphong extends quatao{
   private int soluong;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void tinhtien()
    {
        int s=soluong*getGiaban();
        System.out.println("số tiền là : "+s);
    }
}
