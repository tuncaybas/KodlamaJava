
public class Main {  
  public static void main(String args[]) { 
     Category kategori=new Category(1,"Programlama Dilleri");

     Education egitim1=new Education(1, 1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.","https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0");
     
     Education egitim2=new Education(2, 1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.","https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI");

     Education egitim3=new Education(3, 1, "Programlamaya Giriş ve Temel Kurs", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.","https://www.filepicker.io/api/file/BBLmG3XFTtm8XBTrzg4v");

     EducationManager educationManager=new EducationManager();

     educationManager.addEducation(egitim1);
     System.out.println(educationManager.getAllEducation().length+" adet eğitim var");
      educationManager.addEducation(egitim2);
     System.out.println(educationManager.getAllEducation().length+" adet eğitim var");
      educationManager.addEducation(egitim3);
     System.out.println(educationManager.getAllEducation().length+" adet eğitim var");

     System.out.println("Son Durum");

     for(Education education:educationManager.getAllEducation()){
       System.out.println(education.name);
     }
  } 
}