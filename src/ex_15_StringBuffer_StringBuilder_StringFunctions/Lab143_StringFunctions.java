package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab143_StringFunctions {
    public static void main(String[] args) {
        String name="Poonam";

        //1.length & charAt
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        //2.concat()
        System.out.println(name.concat(" Prasad"));

        //3.contains()
        System.out.println(name.contains("nam"));

        //4.equals()
        System.out.println(name.equals("Poonam"));

        //5.equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("POONAM"));

        //6.indexOf() & lastIndexOf()
        System.out.println(name.indexOf('o'));
        System.out.println(name.lastIndexOf('o'));

        //7. length()
        System.out.println(name.length());

        //8.replace()
        System.out.println(name.replace('P','S'));

        //9.subString()
        System.out.println(name.substring(2,5));

        //10.split()
        String email="poonamprasad94@gmail.com";
        String [] split=email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //11.upperCase()
        System.out.println(name.toUpperCase());

        //12.lowercase()
        System.out.println(name.toLowerCase());

        //13.startsWith()
        System.out.println(name.startsWith("P"));

        //14.endsWith()
        System.out.println(name.endsWith("m"));

        //15.trim()
        String name1="   Amit    ";
        System.out.println(name1.trim());

        //16 compareTo()
        System.out.println(name.compareTo("poonam"));

        //StringBuilder & StringBuffer
        StringBuilder builder=new StringBuilder("Poonam");
        System.out.println(builder);
        System.out.println(builder.toString());

        StringBuffer buffer=new StringBuffer("Myra");
        System.out.println(buffer.toString());
    }

}
