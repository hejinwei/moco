package com.github.dreamhead.moco.bootstrap;

public final class Main {
    public static void main(final String[] args) {
        String globalSettings = "settings.json";
        String[] paramArr = new String[] {"start", "-p", "12345", "-g", globalSettings};
        new Bootstrap().run(paramArr);
    }
}
