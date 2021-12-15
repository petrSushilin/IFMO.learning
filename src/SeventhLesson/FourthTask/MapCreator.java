package SeventhLesson.FourthTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapCreator {

    public static Map<User, Integer> createNewMap(ArrayList<String> playersName) {
        int number = playersName.size();

        ArrayList<Integer> score = finalMatchScore(number);

        HashMap<User, Integer> playersMap = new HashMap<User, Integer>();

        for (int i = 0; i < number; i++) {
            String userName = playersName.get(i);
            User user = new User(userName);
            playersMap.put(user, score.get(i));
        }

        return playersMap;
    }

    private static ArrayList<Integer> finalMatchScore(int number) {
        int start = 80;
        int end = 180;
        
        ArrayList<Integer> finalScore = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int randomPoints = start + (int) (Math.random() * (end - start));
            finalScore.add(randomPoints);
        }

        return finalScore;
    }
}
