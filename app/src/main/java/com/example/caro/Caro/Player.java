package com.example.caro.Caro;

public abstract class Player {
    String name;

    /**
     * request name of player
     */
    public abstract void requestName();

    /**
     * trả về một đối tượng Position, biểu thị tọa độ mà người chơi đã chọn.
     * @param board
     * @return
     */
    public abstract Position takeTurn(Board board);
}
