class Vowel{
    public static void main(String[] args){ 
    char var='D';
    
    if((var=='A'||var=='a')||(var=='E'||var=='e')||(var=='I'||var=='i')||(var=='O'||var=='o')||(var=='U'||var=='u')){
         System.out.println("given caracter " +var+ " is Vowel");
    }else{
        System.out.println("given caracter " +var+ " is a constant");
    }
    }

}

// && = TT=T, TF=F, FT=F, FF=F
// || = TT=T, TF=T, FT=T, FF=F