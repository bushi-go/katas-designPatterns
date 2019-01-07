package main.java.katas.creationnal.abstractfactory.factorymethodmaze;

public interface MazeFactory{
    public Maze makeMaze();
    public Room makeRoom(int roomNumber);
    public Door makeDoor(Room r1, Room r2);
    public Wall makeWall(WallType type);
}