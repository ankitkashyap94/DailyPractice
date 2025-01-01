public class ReverseString extends ReverseText {
    public static void main(String[] args) {

        System.out.println(revStr("Ankit"));

    }
}

class ReverseText{

    public static StringBuilder revStr(String str){

        String text = str;
      StringBuilder rev = new StringBuilder();
      rev.append(text);
      rev.reverse();

      return rev;



    }


}
