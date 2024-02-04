package BasicJava.HelloWord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        System.out.println("Ramaand Yadav");
        SteamAPI();
    }
    public static void SteamAPI(){
        List<Integer>nums = Arrays.asList(5,7,2,5,7,8);
        
        // for(int i=0; i<nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }
        Consumer<Integer> con = n->System.out.println(n);
            
    
        // nums.forEach(n->System.out.println(n));
        // nums.forEach(con);

        Stream<Integer> s1 = nums.stream();
        s1.forEach(con);
        //Steam can't be reused
        
    }
}