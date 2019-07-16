package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {
    private String[] strArr;
    private LinkedHashMap<String, Integer> wordMap;

    public WordCounter(String... strings) {
        this.strArr = strings;
        this.wordMap = new LinkedHashMap<>();
    }

    public Map<String, Integer> getWordCountMap() {
        for (String str : this.strArr){
            this.wordMap.merge(str, 1, Integer::sum);
        }
        return this.wordMap;
    }
}
