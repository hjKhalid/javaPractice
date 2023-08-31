// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,4,3};
        System.out.println(removeDuplicates(arr));
        }
        static  int removeDuplicates(int [] nums ){
         HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            System.out.println(set);
         return set.size();
        }
    }
