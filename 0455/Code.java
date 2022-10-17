class Solution {
    public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s); //对孩子的胃口和饼干大小进行排序
    int g_index=0;
    int s_index=0;
    while(g_index<g.length&&s_index<s.length){
        if(g[g_index]<=s[s_index]){ //如果可以喂饱孩子，索引各加一
            g_index++;
            s_index++;
        }
        else{
            s_index++; //如果喂不饱，饼干索引加一
        }
    }
    return g_index;
    }
}
