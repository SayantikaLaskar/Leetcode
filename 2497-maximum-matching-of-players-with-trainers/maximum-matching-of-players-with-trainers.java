class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m=players.length, n=trainers.length;
        int c=0, i=0, j=0;
        while(i<m && j<n){
            if(players[i]>trainers[j]){
                j++;
            }else{
                c++;
                i++;
                j++;
            }
        }
        return c;
    }
}