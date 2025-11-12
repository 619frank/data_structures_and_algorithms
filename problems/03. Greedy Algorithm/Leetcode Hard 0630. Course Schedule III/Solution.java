class Solution {
    public static void main(String[] args) {
        int[][] courses = {{100,200},{200,1300},{1000,1250},{2000,3200}};
        System.out.println(scheduleCourse(courses));
    }
    
    public static int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());

        int time = 0;

        for(int[] course: courses){
            time += course[0];
            maxHeap.offer(course[0]);
            if(time > course[1]){
                time -= maxHeap.poll();
            }
        }
        return maxHeap.size();
    }
}