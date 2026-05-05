package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(63, 102, 14, 10, 5);
        if (Policy.score(signalcase_1) != 150) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(100, 72, 8, 25, 11);
        if (Policy.score(signalcase_2) != 128) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(77, 106, 16, 18, 5);
        if (Policy.score(signalcase_3) != 130) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("review")) throw new AssertionError("decision mismatch");
    }
}
