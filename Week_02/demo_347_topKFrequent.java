import java.util.*;

public class demo_347_topKFrequent {

    public static void main(String[] args) {
        List<Integer> res = topKFrequent(new int[]{2,2,34,2,34,43},2);
        System.out.println(res.size());
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {

        if (nums == null) {
            throw new IllegalArgumentException("数组不能为空!");
        }

        HashMap<Integer,Integer> counterMap = new HashMap();
        for(int num : nums){
            if (counterMap.containsKey(num)) {
                counterMap.put(num, counterMap.get(num) + 1);
            } else {
                counterMap.put(num, 1);
            }
        }


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 01 - 02;
            }
        });

        counterMap.keySet().forEach(num -> {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(num);
            } else if (counterMap.get(num) > counterMap.get(priorityQueue.peek())) {
                priorityQueue.remove();
                priorityQueue.offer(num);
            }
        });

        List<Integer> result = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            result.add(priorityQueue.remove());
        }

        return result;
    }

}
