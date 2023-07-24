package ex09_Family;

public class Family {
  private int familyCount;//가족의 수,배열의 길이
  private Person[] family;//가족 배열,배열의 선언만 수행
  
  public Family(int familyCount) {
    this.familyCount=familyCount;
    family=new Person[familyCount];//가족배열,배열의 선언만 수행
    
   
  }

 
  public int getFamilyCount()
  {
    return familyCount;
  }
  public void setFamliyCount(int familyCount)
  {
    this.familyCount=familyCount;
    Person[]temp=new Person[familyCount];
    System.arraycopy(family, 0, temp, 0, family.length);//System.arraycopy(원본배열, 원본 배열의 복사 시작 지점, 복사할 배열, 복사할 배열의 복사 시작 지점, 복사할 요소의 개수)
    family=temp;
  }
  public Person[] getFamily() {
    return family;
  }

  public void setFamily(Person[] family) {
    this.family = family;
  }

  
  
  
  
 
}
