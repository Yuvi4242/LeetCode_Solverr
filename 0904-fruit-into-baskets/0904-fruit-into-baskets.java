class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int high=0;
        int max=0;
        int n=fruits.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(high=0;high<n;high++){
            map.put(fruits[high],
            map.getOrDefault(fruits[high], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[low],
                        map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }
                low++;
            }
            max = Math.max(max, high - low + 1);
        }
        return max;
    }
}