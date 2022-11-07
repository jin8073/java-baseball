package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Play {

    public static void playStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        String answerNumber = createThreeNumber();

        System.out.print("숫자를 입력해주세요 : ");
        String playerNumber = Console.readLine();
    }
    public static String createThreeNumber() {
        int size = 0;
        String randomNumber = "";
        while (size > 3) {
            randomNumber += Randoms.pickNumberInRange(1, 9);
            if (Exception.isRedundancy(randomNumber)) {
                randomNumber = randomNumber.substring(0, randomNumber.length()-1);
                size--;
            }
            size++;
        }
        return randomNumber;
    }
}
