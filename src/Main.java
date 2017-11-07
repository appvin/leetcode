import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        String[] strings=new String[]{"hot","dot","dog","lot","log","cog"};
        List<String> list= Arrays.asList(strings);
        System.out.println(new Solution().ladderLength("hit","cog",list));
    }
}
