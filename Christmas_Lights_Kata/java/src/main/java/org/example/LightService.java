package org.example;

public interface LightService {

    void on(int startRow, int endRow, int startColumn, int endColumn);
    void off(int startRow, int endRow, int startColumn, int endColumn);
    void toggle(int startRow, int endRow, int startColumn, int endColumn);
    long count();
}
