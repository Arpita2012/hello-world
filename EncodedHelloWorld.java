public class EncodedHelloWorld {
    static String  encodedMessage(){
      StringBuilder w1 = new StringBuilder("");
         w1.append( Character.toString((char)('A'+7)));
         w1.append(Character.toString((char)('a'+4)));
         w1.append(Character.toString((char)('a'+11)));
         w1.append(Character.toString((char)('a'+11)));
         w1.append(Character.toString((char)('a'+14)));
         
        StringBuilder w2 = new StringBuilder(""); 
        w2.append(Character.toString((char)('A'+22)));
         w2.append(Character.toString((char)('a'+14)));
        w2.append(Character.toString((char)('a'+17)));
        w2.append(Character.toString((char)('a'+11)));
        w2.append(Character.toString((char)('a'+3)));
        return w1 +" "+ w2;
    }
    public static void main (String args []){
     String s = encodedMessage();
        System.out.println(s);
    }
}
