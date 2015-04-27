import java.util.Arrays;
import java.util.List;

/**
 * Created by maxin on 15-1-29.
 */
public class Test {
    public static void main(String arg[]){
        String[] array=new String[3];
        array[0]="王利虎";
        array[1]="张三";
        array[2]="李四";
        List<String> list= Arrays.asList(array);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
