package Tasks.Tasks022;

class Students{
    public static void main(String[] args) {
       ATB[] students=new ATB[3];//Class is also user defined datatype
        //Entering values on students array
        students[0]=new ATB("Poonam",10,923232433);
        students[1]=new ATB("Amit",15,32343535);
        students[2]=new ATB("Sonam",10,12345565);

        //Printing elements of Array
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i]);
        }

        //Encapsulation
        ATB student1=new ATB("Student1",5,212121);
        System.out.println(student1.getName());
        System.out.println(student1.getExperience());
        System.out.println(student1.getPhoneNo());

        student1.setName("Student2");
        student1.setExperience(10);
        student1.setPhoneNo(1234567);

        System.out.println("-----------------");
        System.out.println(student1.getName());
        System.out.println(student1.getExperience());
        System.out.println(student1.getPhoneNo());

    }


}
