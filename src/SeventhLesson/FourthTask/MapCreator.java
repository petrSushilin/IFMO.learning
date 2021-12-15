package SeventhLesson.FourthTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapCreator {
    public static Map<String, Integer> createNewMap(ArrayList<String> playersName) {
        int number = playersName.size();

        ArrayList<Integer> score = finalMatchScore(number);

        HashMap<String, Integer> playersMap = new HashMap<String, Integer>();

        for (int i = 0; i < number; i++) {
            playersMap.put(playersName.get(i), score.get(i));
        }

        return playersMap;
    }

    private static ArrayList<Integer> finalMatchScore(int number) {
        int a = 80;
        int b = 180;
        
        ArrayList<Integer> finalScore = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int randomPoints = a + (int) (Math.random() * b);
            finalScore.add(randomPoints);
        }

        return finalScore;
    }
}
