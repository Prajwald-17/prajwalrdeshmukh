import java.util.*;
public class Problem4
 {
 public static void main(String[] args) 
{
 int[] numbers = {1,2,4,5,10,25,30,32,49,56,72,81,96};
 Map<Integer, Integer> countMap = new HashMap<>();
  for (int i = 1; i <= 9; i++)
 {
     countMap.put(i, 0);
      }
 for (int num : numbers)
 {
     for (int i = 1; i <= 9; i++) 
    {
       if (num % i == 0)
       {
            countMap.put(i, countMap.get(i) + 1);
                }}}
for (int i = 1; i <= 9; i++) {
System.out.println(i + ": " + countMap.get(i));
 }}
}
