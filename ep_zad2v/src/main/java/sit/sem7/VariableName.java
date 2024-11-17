package sit.sem7;

public class VariableName {
    public boolean isValidVariableName(String input) {
        int state = 0;

        for (char ch : input.toCharArray()) {
            switch (state) {
                case 0:
                    if (ch == 'a' || ch == 'b') {
                        state = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (ch == 'a' || ch == 'b' || ch == '0' || ch == '1') {
                        state = 1;
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return state == 1;
    }
}
