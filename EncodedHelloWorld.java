public class EncodedHelloWorld {
    static String  encodedMessage(){
        String w1 = Character.toString((char)('A'+7))+
                    Character.toString((char)('a'+4))+
                    Character.toString((char)('a'+11))+
                    Character.toString((char)('a'+11))+
                    Character.toString((char)('a'+14));
        String w2 = Character.toString((char)('A'+22))+
                    Character.toString((char)('a'+14))+
                    Character.toString((char)('a'+17))+
                    Character.toString((char)('a'+11))+
                    Character.toString((char)('a'+3));
        return w1 +" "+ w2;
    }
    public static void main (String args []){
     String s = encodedMessage();
        System.out.println(s);
    }
}
