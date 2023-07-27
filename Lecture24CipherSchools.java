import java.util.*;
public class Lecture24CipherSchools {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="Suryansh"; 
        String name2="Suryansh";

        String name3=new String("CipherSchools"); 
        String name4=new String("CipherSchools");

        System.out.println(name==name2);
        System.out.println(name3==name4);
        System.out.println(name==name3);
        String s1="hello";
        s1=s1+" David";
        System.out.println(s1);
        System.out.println(s1+" How are you ?");
        System.out.println(s1);
        String s2=new String("Hello");
        String s3=new String(" Guys");
        String s4=s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);
        System.out.println(name.equals(name2));
        System.out.println(name3.equals(name4));


        char arr[]={'c','i','p','h','e','r'};
        String strFromArr=new String(arr);
        System.out.println(strFromArr);
        System.out.println("========================");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String back_slash="Hello, I'm \"quoted\"";
        System.out.println(back_slash);
        int len=name.length();
        System.out.println("length of the string \"name\" is : "+len);
        System.out.println("the index of character \"u\" in name is : " + name.indexOf('y'));
        String mantra="abrakadabra";
        System.out.println("the index of character \"a\" from index 5 is: " + mantra.indexOf('a',1));
        int count=0;
        while(count!=-1){
            count=mantra.indexOf('a', count);
            if(count==-1)break;
            System.out.println("char \"a\" found at : "+(count+1));
            count++;
        }

        System.out.println("===============================");
        String hp="harryPuttar";
        String sub_hp=hp.substring(2,9);
        String sub_hp2=hp.substring(2); 
        System.out.println(sub_hp);
        System.out.println(sub_hp2);
        System.out.println("the char at index 4 is : "+ hp.charAt(4));
    

        System.out.println("===================================");
        char arr2[]=hp.toCharArray();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }

        System.out.println("=======================================");
        String khaaliString=new String();
        String khaaliString2=" ";
        String blank_string="             ";
        System.out.println(khaaliString);
        System.out.println(khaaliString2);
        System.out.println(khaaliString.equals(""));
        System.out.println(khaaliString2.equals(""));
        System.out.println(khaaliString.isEmpty());
        System.out.println(khaaliString2.isEmpty());
        System.out.println(blank_string.isBlank());
        System.out.println(khaaliString.isBlank());

        System.out.println("========================================");
        String temp3="heyy";
        String temp4="byee";
        System.out.println(temp3.compareTo(temp4));

        System.out.println("==============================================");
        String temp5="                                ohayo                 ";
        String temp7="                                ohayo                 ";
        String temp6="ohayo            oniichaan ";
        System.out.println("*"+temp5.trim()+"*");
        System.out.println("*"+temp6.trim()+"*");
        System.out.println("*"+temp7.trim()+"*");

        System.out.println("==============================================");
        System.out.println(hp.replace('h', 'c'));

    }
}