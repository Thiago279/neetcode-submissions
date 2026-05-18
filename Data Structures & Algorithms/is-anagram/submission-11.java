class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        int tamanho = s.length();
        
        if (tamanho != t.length()){
            return false;
        }

        for (int i = 0; i < tamanho; i++){
            Character letraS = s.charAt(i);
            Character letraT = t.charAt(i);
            if (map1.containsKey(letraS)){
                map1.put(letraS, map1.get(letraS)+1);
            }
            else{
                map1.put(letraS, 1);
            }

            if (map2.containsKey(letraT)){
                map2.put(letraT, map2.get(letraT)+1);
            }
            else{
                map2.put(letraT, 1);
            }
            
        }


        if (map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
}
