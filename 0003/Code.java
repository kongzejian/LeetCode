 public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start=0;
        int end=0;
        int ans=Integer.MIN_VALUE;
        while(end<s.length()){
            if(!map.containsKey(s.charAt(end))){ //如果没有出现过，将元素-索引加入哈希表中
                map.put(s.charAt(end),end);
                ans=Math.max(ans,end-start+1); //更新长度
                end++; //右指针右移
            }
            else{ //这里是精髓
                start=Math.max(start,map.get(s.charAt(end))+1); //如果出现过，将左指针移动到出现过的索引右边一位，将其移出窗口
                map.replace(s.charAt(end),end); //更新这个出现过的字母的索引值
                ans=Math.max(ans,end-start+1);//更新长度
                end++;//右指针右移
            }
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
