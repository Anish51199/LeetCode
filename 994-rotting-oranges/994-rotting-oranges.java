class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        
        Queue<int[]> q= new LinkedList<>();
        
        int rot=0, fresh=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    rot++;
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1) fresh++;
            }
        }
        
        if(fresh==0) return 0;
        int[] x = {1,-1,0,0};
        int[] y=  {0,0,1,-1};
        
        int days=0;
        while(!q.isEmpty() && fresh>0){
            days++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                for(int j=0;j<4;j++){
                    int X= curr[0]+x[j];
                    int Y= curr[1]+y[j];
                    if(X<0 || X>=m || Y<0 || Y>=n || grid[X][Y]==0|| grid[X][Y]==2) continue;
                        grid[X][Y]=2;
                        q.add(new int[]{X,Y});
                        fresh--;  
                    // System.out.println(X+" "+Y+" "+fresh);

                }
            }
        }
        
        return fresh>0?-1:days;
        
        
    }
}