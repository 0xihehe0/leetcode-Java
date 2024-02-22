public class HelloWorld {
    public static void main(String []args) {
        int x = 2;
        int y = 3;
        recursive(x,y);

    }

    static void recursive (int x ,int y){
        int result = 1;
        for(int i = 0; i < y; i++){
            result = result * x;
        }
        System.out.println(result);
    }

    static void iterative (int x, int y){
        int result = 1;
        int index = 1;

        result = result * x;
        index ++;
        if(index == y){
            return;
        }
        iterative(x,y);
    }
}

