package Tasks.Tasks022;

public class ATB {

   //Encapsulation with private attributes & getter,setter methods
    private String name;
    private int experience;
    private long phoneNo;
    public static String gitHubProfile;

    ATB(String name,int experience, long phoneNo)
    {
        this.name=name;
        this.experience=experience;
        this.phoneNo=phoneNo;
    }

    String getName(){
      return name ;
    }

    void setName(String name)
    {
        this.name=name;
    }

    int getExperience(){
        return experience;
    }

    void setExperience(int experience)
    {
        this.experience=experience;
    }

    long getPhoneNo(){
        return phoneNo;
    }

    void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }

    public String toString(){

        return "ATB { Name: " + name + ", Experience: " + experience + ", PhoneNo: " + phoneNo + " }";

    }
}


