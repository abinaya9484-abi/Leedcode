class Solution {
    public List<String> commonChars(String[] words) {

        int wordsLen = words.length;

        // First fill the char of words[0] index word to map with its count
        // then after always go to each words and check frequency and update minimum of that.
        // at the end we left with answer
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < words[0].length(); i++){
            char ch = words[0].charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // iterate over each string in words[i]
        for(int i = 1; i < wordsLen; i++){
            // create helper map to store frequency of current words[i]
            HashMap<Character, Integer> helper = new HashMap<>();
            for(char ch : words[i].toCharArray()){
                helper.put(ch, helper.getOrDefault(ch, 0) + 1);
            }
            
            // create new map which stores minimum freq of "map" and "helper" HashMap.
            HashMap<Character, Integer> newMap = new HashMap<>();
            for(char ch : map.keySet()){ 
                int count_in_map = map.get(ch); 
                int count_in_helper = helper.getOrDefault(ch, 0);

                if(count_in_helper > 0){ // Add to map only if count is greater than Zero.
                    newMap.put(ch, Math.min(count_in_map, count_in_helper));
                }
            }

            map = newMap;
        }

        // Build result
        List<String> result = new ArrayList<>();
        for(char ch : map.keySet()){
            int count = map.get(ch); // Take count, because we have to add this that number of time in the result array

            for(int i = 0; i < count; i++){
                result.add(String.valueOf(ch)); // Convert to String because we need to return List<String>.
            }
        }

        return result; // return result list.
    }
}