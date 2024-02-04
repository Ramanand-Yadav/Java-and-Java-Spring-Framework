package BasicJava.Lambda;

public class Lambda {
    interface A{
        int add(int i, int j);
    }
    public static void main(String[] args) {
        A obj = (i,j) ->  i+j;
            
        int res = obj.add(5, 5);
        System.out.println("result is "+res);
    }
}
