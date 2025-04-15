package ex_32_CollectionsFramework_List_DSA;

public class Students {
    private String name;
        private int rollNo;

        Students(String name,Integer rollNo){
            this.name=name;
            this.rollNo=rollNo;
        }
        String getName(){
            return this.name;
        }

        void setName(String name){
            this.name=name;
        }

        Integer getRollNo(){
            return this.rollNo;
        }

        void setRollNo(Integer rollNo){
            this.rollNo=rollNo;
        }

        public void printDetails(){
            System.out.println("Name is "+this.name);
            System.out.println("Roll No is "+this.rollNo);
        }

        public String toString(){
            return "Student{" +
                    "name=" + name +"," +
                    " rollNo= "+ rollNo +
                    '}';
        }
}
