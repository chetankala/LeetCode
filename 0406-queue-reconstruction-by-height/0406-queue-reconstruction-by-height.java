class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //sorts the array by
        class QueueComparator1 implements Comparator<int []> {
            public int compare(int[] obj1, int[] obj2) {
              if (obj1 == obj2) {
                  return 0;
              }
              else if (obj1 == null) {
                  return -1;
              }
              else if (obj2 == null) {
                  return 1;
              }
              return obj1[1]-obj2[1];
            }
        }
        

        Arrays.sort(people, new QueueComparator1());

        for(int i=0;i<people.length;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(people[i][0]<=people[j][0]){
                    count+=1;
                }
            }
            if(count>people[i][1]){
                int [] temp=people[i-1];
                people[i-1]=people[i];
                people[i]=temp;
                i-=2;
            }
        }

        return people;
    }
}