import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TddQuestion {
    public String getBiggerThanTwo(String string) {
        Boolean flag = false;
        StringBuilder substring = new StringBuilder();
        StringBuilder finalSubstring = new StringBuilder();

       for (int i =0;i<string.length();i++){

           if (!flag)substring = new StringBuilder();
           if (string.charAt(i)<'9'&&string.charAt(i)>='0'){
               flag=true;
               substring.append(string.charAt(i));

           }else {
               flag=false;
               if (substring.length()>2){
                   if (finalSubstring.length()!=0){
                       finalSubstring.append(",");
                   }
                   finalSubstring.append(substring);

               }
           }
           if (i==string.length()-1){
               if (substring.length()>2){
                   if (finalSubstring.length()!=0){
                       finalSubstring.append(",");
                   }
                   finalSubstring.append(substring);

               }
           }
       }
       if (finalSubstring.length()!=0) {
           String digit = finalSubstring.substring(0);

          return digit;
       }
       else   return null;
       // i used null because use assertNull in test method
        // if we want to method returned empty string just need to return ""

    }

    public  String getBiggerThanTwoWithStream(String string){

        String[] split = string.split("[^\\d]");
        List<Integer> numbersBiggerThan99 = Stream.of(split)
                .filter(i -> !(i.isEmpty()) && Integer.parseInt(i) > 99)
                .map(Integer::parseInt).collect(Collectors.toList());
        String result ="";
              if (!numbersBiggerThan99.isEmpty()) result= numbersBiggerThan99.toString();


        return result;
    }





}
