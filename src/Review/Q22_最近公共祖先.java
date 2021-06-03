package Review;

public class Q22_最近公共祖先 {
    public int getLCA(int a, int b){
        // 画一颗树
        while(a != b){
            if(a > b){
                a = a/2;
            }else {
                b = b/2;
            }
        }
        return a;
    }
}
