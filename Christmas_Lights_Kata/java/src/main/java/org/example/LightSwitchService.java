package org.example;


public class LightSwitchService implements MyLightService {

    boolean lights[][];

    public LightSwitchService() {
        lights = new boolean[1000][1000];
    }

    public void on(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] = true;
    }

    public void off(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] = false;
    }

    public void toggle(int startRow, int endRow, int startColumn, int endColumn) {
        for(int i = startRow; i <= endRow; i++)
            for(int j = startColumn; j <= endColumn; j++)
                lights[i][j] = !lights[i][j];
    }

    public long count() {
        int count = 0;
        for(int i = 0; i <= 999; i++)
            for(int j = 0; j <= 999; j++)
                if(lights[i][j])
                    count++;

        return count;
    }
}
