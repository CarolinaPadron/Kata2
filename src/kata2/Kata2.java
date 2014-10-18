package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,1,5,1,10};
        
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        
        for (int number : numbers) {
            if(frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }
        
        int number = -1;
        int maxOcurrences = 0;
        
        for (Integer Key : frequencyMap.keySet()) {
            if(frequencyMap.get(Key) > maxOcurrences) {
                number = Key;
                maxOcurrences = frequencyMap.get(Key);
            }
        }
            System.out.println(number + "->" + maxOcurrences);
    }   
}
