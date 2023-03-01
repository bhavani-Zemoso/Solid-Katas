package org.example;

import java.util.Arrays;

public class LightBrightnessService implements MyLightService {
    long lights[][];

    public LightBrightnessService() {
        lights = new long[1000][1000];
    }
    @Override
    public void on(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] += 1;
    }

    @Override
    public void off(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] = Math.max(0, lights[i][j]--);
    }

    @Override
    public void toggle(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] += 2;
    }

    @Override
    public long count() {
        return Arrays.stream(lights)
                .flatMapToLong(Arrays::stream)
                .sum();
    }
}
