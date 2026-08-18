class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> nestedList = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0,j=1;i<arr.length&&j<arr.length;i++,j++) {
            nestedList.add(Arrays.asList(arr[i], arr[j]));
        }
        int minDiff = Integer.MAX_VALUE;
        for(List<Integer>pair : nestedList) {
            if(pair.size()>=2){
                int diff = Math.abs(pair.get(0)-pair.get(1));
                if(diff<minDiff) {
                    minDiff=diff;
                }
            }
        }
        final int targetDiff = minDiff;
        nestedList.removeIf(pair -> pair.size()<2 || Math.abs(pair.get(0)-pair.get(1)) != targetDiff);
        return nestedList;
    }
}