package week3;

public class Week3 {
    int a;
    public static int max(int m, int n) {
        if(m>n) return m;
        else return n;
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
    }

    public static int minOfArray(int[] array) {
        int n=array.length;
        int min=array[0];
        for(int i=0;i<n;i++)
        {if(min>array[i]) min=array[i];}
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     *
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        String a=" ";
        double BMI = ((weight)/(height)/(height));
      if(BMI<18.5)  a="Thiếu cân";
      else if(BMI>18.5&&BMI<22.99) a="Bình thường";
      else if(BMI>=22.99&&BMI<=24.99) a="Thừa cân";
      else if(BMI>24.99) a="Béo phì";
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
          return a;
    }

    public static void main(String[] a)
    {
      int abc[]={1,2,0,3,4,5};
      System.out.println( calculateBMI(60,1.7));
    }
}
