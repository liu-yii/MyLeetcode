import java.util.*;

public class LC692 {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        HashMap<String,Integer>map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        // 传入 count.keySet() 对列表初始化
        List<String> candidates = new ArrayList<>(map.keySet());
        candidates.sort(new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                if (map.get(w1).equals(map.get(w2))) {
                    return w1.compareTo(w2);
                } else {
                    return map.get(w2) - map.get(w1);
                }
            }
        });
        return candidates.subList(0, k);




    }
}
