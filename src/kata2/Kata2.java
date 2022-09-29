package kata2;

import java.util.Map;
import kata2.HistogramGenerator;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"", "Alberto", "", "Marta", "Laura", "", "Carlos", "Laura", "Alberto", "", "Juan", "Juan", "Santiago", "María"};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<Integer, Integer> histogram = histogramGenerator.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());    
        }
        
        
    }
    
}