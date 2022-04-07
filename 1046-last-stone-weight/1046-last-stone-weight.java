class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int item:stones) {
            maxHeap.add(item);
        }
        while(maxHeap.size()>1) {
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            maxHeap.add(a-b);
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}