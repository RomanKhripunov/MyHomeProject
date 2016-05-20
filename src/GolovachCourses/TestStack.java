package GolovachCourses;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();

        strings.push("first");
        strings.push("second");

        for (int i = strings.size(); i > 0; i--) {
            System.out.println(strings.get(i -1));
        }
    }
}
