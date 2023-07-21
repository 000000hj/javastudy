package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {
  
    
    
    Address address=new Address();
    // 정보 추가 (Setter 활용)
    address.setPostCode("08505");
    address.setRoadAddr("가산디지털 2로 95");
    address.setJibunAddr("가산동 550-7");
    address.setDetailAddr("3층 6강의실");
    Contact contact=new Contact();
    contact.setHomeTel("02-818-7950");
    contact.setMobile("010-7111-6221");
    contact.setAddress(address);
    // 정보 추가 (Setter 활용)
    
    Member member1 = new Member();
    Member member2=new Member();
    // 정보 추가 (Setter 활용)
    member1.setContact(contact);
    member1.setName("보바로꾸꺼");
    
    
    //Member member 객체 정보 확인 (Getter 활용)
   System.out.println("이름:"+ member1.getName());
   System.out.println("집전화:"+ member1.getContact().getHomeTel());
   System.out.println("모바일:"+ member1.getContact().getMobile());
   System.out.println("우편번호:"+ member1.getContact().getAddress().getPostCode());
   System.out.println("도로명:"+ member1.getContact().getAddress().getRoadAddr());
   System.out.println("지번:"+ member1.getContact().getAddress().getJibunAddr());
   System.out.println("지번:"+ member1.getContact().getAddress().getDetailAddr());
   
   
  }

}
