package katas.creationnal.abstractfactory.factorymethodmaze.interfaces;

import katas.creationnal.abstractfactory.factorymethodmaze.enums.WallType;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Room;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Maze;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Wall;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Door;

public interface MazeFactory{
    public Maze makeMaze();
    public Room makeRoom(int roomNumber);
    public Door makeDoor(Room r1, Room r2);
    public Wall makeWall(WallType type);
}