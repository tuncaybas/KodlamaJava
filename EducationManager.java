
public class EducationManager{
  private Education[] educations;



  public Education[] getAllEducation(){
    return educations;
  }

  public void addEducation(Education education){
    if (educations==null){
      educations=new Education[]{education};
      //educations[0]=education;
    }else{

    Education[] yeni = new Education[educations.length+1];

    for(int i = 0; i < educations.length; i++) {
        yeni[i] = educations[i];
    }

    yeni[yeni.length - 1] = education;
    educations=yeni;
    }
    System.out.println(education.name+" eklendi");
  }


}