
public class Product{
  int id;
  String name;
  double unitPrice;
  String detail;

  public Product(){ // constructor yapı
    System.out.println("Ben çalıştım");
  }

  public Product(int id,String name,double unitPrice,String detail){ // constructor yapı
    this.id=id;
    this.name=name;
    this.unitPrice=unitPrice;
    this.detail=detail;
  }
}