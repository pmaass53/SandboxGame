package net.sandbox.tile;

public class Tile {
    public int x, y;
    public String type;
    public String getType() {
        return type;
    }
    public int[] getLocation() {
        return new int[] {x, y};
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Tile(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }
}