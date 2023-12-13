public class String1 {
    public static void main(String[] args){
        String str1="ABC";
        System.out.println(str1);
        String str3=new String("ABC");
        System.out.println(str3);
        String str2=new String("ABC");
        System.out.println(str2);

        System.out.println(str1==str3);

        String str4=str1;
        System.out.println(str1==str4);

        String str5= str5=str1+str2;
        System.out.println(str5);

        String str6=new String("ABC ABC");
         String str7="ABC";
         String str8=str7+"ABC";
        System.out.println(str6==str8);

        String str9="ABC";
        String str0= new String("ABC");
        System.out.println(str9.equals(str0));
        System.out.println(str9==str0);

        String str10="CODEKUL";
        char[] ch=str10.toCharArray();
        System.out.println(ch);
        for(char i=0; i<=str10.length(); i++){
            System.out.println(ch[i]);
        }       
    }
    
}
