package katas.creationnal.abstractfactory.factorymethodmaze;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import katas.creationnal.abstractfactory.factorymethodmaze.enums.Direction;
import katas.creationnal.abstractfactory.factorymethodmaze.enums.WallType;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Door;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Maze;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.MazeFactory;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Room;
import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Wall;

public class MazeGame {
    public Maze createMaze(MazeFactory factory) {
        Maze newMaze = factory.makeMaze();
        List<Room> mazeRooms = new ArrayList<>();
        Random hazardGenerator = new Random();
        for(int i = 0; i<42; i++){
            Room newRoom = factory.makeRoom(i);
            Wall northWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            Wall southWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            Wall eastWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            Wall westWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            newRoom.setSide(Direction.NORTH, northWall);
            newRoom.setSide(Direction.SOUTH, southWall);
            newRoom.setSide(Direction.EAST, eastWall);
            newRoom.setSide(Direction.WEST, westWall);
            mazeRooms.add(newRoom);
        }
        IntStream wayOut = hazardGenerator.ints(21, 1, 42);
        Door firstDoor;
        return newMaze;
    }

    private WallType getWallType(int hazard){
        switch(hazard){
            case 0 :
                return WallType.BRIQ;
            case 1:
                return WallType.MUD;
            case 2:
                return WallType.STONE;
            case 3:
                return WallType.WOOD;
            default:
                return WallType.STONE;
        }
    }
}