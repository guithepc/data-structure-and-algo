package datasctructure.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GapExercise {

    public int solution(int N) {
        // Implement your solution here
        String binaryString = Integer.toBinaryString(N);
        String[] arrayString = new String[binaryString.length()];

        for (int i = 0; i < binaryString.length(); i++){
            arrayString[i] = String.valueOf(binaryString.charAt(i));
        }

        List<Integer> list = new ArrayList<>();

        String prev = null;
        boolean startGap = false;
        int count =0;

        for (int i = 0; i < binaryString.length(); i++){
            boolean closeGap = false;

            if (arrayString[i].equals("1")) {
                startGap = true;
                if (("0").equals(prev) && arrayString[i].equals("1")) {
                    closeGap = true;
                    list.add(count);
                    count = 0;
                }
            }
            if (!closeGap){
                if (startGap && arrayString[i].equals("0")){
                    count ++;
                }
                prev = arrayString[i];
            }

        }

        if (list.isEmpty()){
            return 0;
        }
        return Collections.max(list);

    }
}
