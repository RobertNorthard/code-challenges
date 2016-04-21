package projecteuler.problem1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robertnorthard
 */
public class Problem1 {
    
    public static void main(String[] args){
        
        List<Integer> numbers = new ArrayList<>();
        
        for(int i = 0; i < 1000; i++){
            if(isMultiple(i,3) || isMultiple(i,5)){
                numbers.add(i);
            }
        }
        
        System.out.println(sum(numbers));
        
    }
    
    private static boolean isMultiple(int number, int multiple){
        return number % multiple == 0;
    }
    
    private static int sum(List<Integer> numbers){
        return numbers.stream().reduce(0, (x,y) -> x+y);
    }
}
