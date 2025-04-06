package ex_21_OOPs_Encapsulation;

public class Lab189_EncapsulationDemo {
    public static void main(String[] args) {

        VwoLogin v1=new VwoLogin("admin","Test1");
        System.out.println(v1.userName);
        System.out.println(v1.password);
        System.out.println("-----------------");

        GoodVwoLogin v2=new GoodVwoLogin("admin","Test123");
        //System.out.println(v2.userName);
        //System.out.println(v2.password);
        System.out.println(v2.getUserName());
        System.out.println(v2.getPassword());
        System.out.println("-----------------");

        v2.setUserName("Poonam");
        System.out.println(v2.getUserName());
        System.out.println("-----------------");

        v2.setPassword("Test12345",false);
        System.out.println(v2.getPassword());

        System.out.println("-----------------");

        v2.setPassword("Testing",true);
        System.out.println(v2.getPassword());
    }
}

class VwoLogin{
    public String userName;
    public String password;

    VwoLogin(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
}

class GoodVwoLogin{
  private String userName;
  private String password;

  GoodVwoLogin(String userName,String password)
  {
      this.userName=userName;
      this.password=password;
  }

  String getUserName()
  {
      return userName;
  }

  void setUserName(String userName)
  {
      this.userName=userName;
  }

  String getPassword()
  {
      return password;
  }

  void setPassword(String password, boolean isAdmin)
  {
      if(isAdmin)
      {
          this.password=password;
      }
      else{
          System.out.println("You are not allowed to set password");
      }
  }
}