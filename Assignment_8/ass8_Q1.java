import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ass8_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.println("Enter a line of text:");
        String line=sc.nextLine().toLowerCase().trim();
        String[] words=line.isEmpty()?new String[0]:line.split("\\s+");
        Map<String,Integer> count=new LinkedHashMap<>();
        for(String word:words) { word=word.replaceAll("^[^a-z0-9']+|[^a-z0-9']+$", ""); if(!word.isEmpty()) count.put(word,count.getOrDefault(word,0)+1); }
        for(Map.Entry<String,Integer> entry:count.entrySet()) System.out.println(entry.getKey()+" : "+entry.getValue());
        sc.close();
    }
}
