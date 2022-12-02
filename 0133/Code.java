 public static Node cloneGraph(Node node) {
        Node[] marked=new Node[101]; //专门存储克隆的结点，位置索引为结点的值
        return dfs(node,marked);
    }
    public static Node dfs(Node node,Node[] marked){
        if(node==null){
            return null;
        }
        if(marked[node.val]!=null){ //如果访问过，返回克隆过的结点
            return marked[node.val];
        }
        Node new_1=new Node(node.val,new ArrayList<>()); //没访问过，克隆
        marked[node.val]=new_1; //将其加入数组中
        for(int i=0;i<node.neighbors.size();i++){ //遍历原结点的邻居
            new_1.neighbors.add(dfs(node.neighbors.get(i),marked)); //对克隆结点的邻居进行添加,其中递归，dfs如果已经访问并创作过，会直接返回克隆的结点，如果没有访问过，dfs递归
        }
    return new_1;
    }
