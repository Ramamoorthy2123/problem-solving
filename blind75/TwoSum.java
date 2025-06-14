public class Solution{
  public int[] twoSum(int[]arr, int target){

 Map<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      int comp = target - arr[i];
      if(map.containsKey(comp)){
        return new int[]{map.get(comp),i};
      }
      map.put(arr[i],i);
    }
    return new int[]{};
  }
}
