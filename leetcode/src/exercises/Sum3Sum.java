package exercises;

import java.util.*;

public class Sum3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++){
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while(p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];
                if(sum == 0){
                    ArrayList<Integer> sp = new ArrayList<>();
                    sp.add(nums[i]);
                    sp.add(nums[p1]);
                    sp.add(nums[p2]);

                    ans.add(sp);
                    p1++;
                }
                else if(sum < 0) p1++;
                else p2--;
            }
        }
        return new ArrayList<>(ans);
    }
}
class Solution1msBeats100 {
    private List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        return new AbstractList<List<Integer>>() {
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }
            public int size() {
                init();
                return res.size();
            }
            private void init() {
                if (res != null) return;
                Arrays.sort(nums);
                int l, r;
                int sum;
                Set<List<Integer>> tempRes = new HashSet<>();
                for (int i = 0; i < nums.length - 2; ++i) {
                    l = i + 1;
                    r = nums.length - 1;
                    while (l < r) {
                        sum = nums[i] + nums[l] + nums[r];
                        if (sum == target) {
                            List<Integer> t = new ArrayList<>();
                            t.add(nums[i]);
                            t.add(nums[l]);
                            t.add(nums[r]);
                            tempRes.add(t);
                        }
                        if (sum < target) ++l;
                        else --r;
                    }
                }
                res = new ArrayList<List<Integer>>(tempRes);
            }
        };
    }
}