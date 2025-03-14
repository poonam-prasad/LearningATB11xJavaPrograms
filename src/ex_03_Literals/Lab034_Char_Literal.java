package ex_03_Literals;

public class Lab034_Char_Literal {

    public static void main(String[] args) {
        char c1='A';
        //char c2="A"; //this is String

        char c2='b';
        char c3='@';
        char c4='_';
        char c5='9';
        char c6='(';
        char c7=' ';

        //Escape characters
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("Poonam"+new_line+"Prasad");
        System.out.println("Poonam"+tab_line+"Prasad");
        System.out.println("Poonam"+back_space+"Prasad");
        System.out.println("Poonam"+carriage_return+"Prasad");

        char c10='A'; //65 ASCII
        System.out.println(c10+10);
        System.out.println('a'); //97 ASCII
        System.out.println('a'+1);

        char ruppes = '₹';
        System.out.println(ruppes);

    }
}
