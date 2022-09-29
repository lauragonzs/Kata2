package kata2;

import java.util.Map;
import kata2.HistogramGenerator;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {1, 6, 2, 8, 3, 8, 2, 7, 3, 4, 2, 9, 0, 6};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<Integer, Integer> histogram = histogramGenerator.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());    
        }
        
        
    }
    
}