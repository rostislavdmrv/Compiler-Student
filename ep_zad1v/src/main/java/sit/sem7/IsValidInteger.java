package sit.sem7;

public class IsValidInteger {
    public boolean isValidIntegerConstant(String input) {
        int state = 0;

        for (char ch : input.toCharArray()) {
            switch (state) {
                case 0:
                    if (Character.isDigit(ch)) {
                        state = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (!Character.isDigit(ch)) {
                        return false;
                    }
                    break;
            }
        }

        return state == 1;
    }
}
