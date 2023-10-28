public class W04_Strings {
    public static  void reverseString(char [] string){
        int i=0,j=string.length-1;
        char aux;
        while(i<=j){
            aux=string[i];
            string[i]=string[j];
            string[j]=aux;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char [] s1 ={'h','e','l','l','o'};
        char [] s2 ={'H','a','n','n','a','h'};
        reverseString(s1);
        System.out.println(s1);
        reverseString(s2);
        System.out.println(s2);
    }
}
