import java.util.HashMap;

public class Translator {
    HashMap<Integer,String> numericAlpha = new HashMap<>();


    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
           numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public Translator(HashMap<Integer, String> numericAlpha) {
        this.numericAlpha = numericAlpha;
    }



    String translate(Integer number) {
    return numericAlpha.get(number);

    }
// oefenen met datatype en return type, void roep je methode aan.
//HashMap<Integer, String> getHasMap(){
//        return numericAlpha;
//}
//
//Integer getInteger(){
//        return 10;
//}
//
//String getString(){
//        return "10";
//}
//
//void geefVoid(){
//    System.out.println("geef maar terug");
//
//}



}
