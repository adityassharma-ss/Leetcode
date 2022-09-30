// class Solution{
//     public boolean canFinish(int numCourses, int[][] prerequisites) {
//     int[] indegree = new int[numCourses];
//         for(int[] p : prerequisites){
//             indegree[p[0]]++;
//         }
//         Queue<Integer> queue = new LinkedList<Integer>();
//         for(int i = 0; i < numCourses; i++){
//             if(indegree[i] == 0) queue.offer(i);
//         }
//         int count = 0;
//         while(!queue.isEmpty()){
//             int cur = queue.poll();
//             count++;
//             for(int[] p : prerequisites){
//                 if(p[1] == cur){
//                     indegree[p[0]]--;
//                     if(indegree[p[0]] == 0) queue.offer(p[0]);
//                 }
//             }
//         }
//         return count == numCourses;
// }
// }

class Solution{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    Course[] courses = new Course[numCourses];
    for (int i = 0; i < numCourses; i++) {
        courses[i] = new Course();
    }
    for (int i = 0; i < prerequisites.length; i++) {
        courses[prerequisites[i][0]].add(courses[prerequisites[i][1]]);
    }
    for (int i = 0; i < numCourses; i++) {
        if(isCyclic(courses[i])) return false;
    }
    return true;
}

private boolean isCyclic(Course cur) {
    if (cur.tested == true) return false;
    if (cur.visited == true) return true;
    cur.visited = true;
    for (Course c : cur.pre) {
        if (isCyclic(c)) {
            return true;
        }
    }
    cur.tested = true;
    return false;
}

class Course {
    boolean visited = false;
    boolean tested = false;
    List<Course> pre = new ArrayList<Course>();
    public void add(Course c) {
        pre.add(c);
    }
}
}
