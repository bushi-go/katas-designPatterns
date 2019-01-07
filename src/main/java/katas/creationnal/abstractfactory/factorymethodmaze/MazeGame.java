package katas.creationnal.abstractfactory.factorymethodmaze;

import MazeFactory;
import Door;
import Room;
import java.util.Random;

public class MazeGame{
    public Maze createMaze(MazeFactory factory){
        Maze newMaze = factory.makeMaze(); 
        List<Room> mazeRooms = new ArrayList<>();
        Random hazardGenerator = new Random();
        for(int i = 0; i<42; i++){
            Room newRoom = factory.makeRoom(i);
            Wall northWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            Wall southWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            Wall eastWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            Wall westWall = factory.makeWall(getWallType(hazardGenerator.nextInt(4)));
            newRoom.setSide(Direction.NORTH, northWall));
            newRoom.setSide(Direction.SOUTH, southWall);
            newRoom.setSide(Direction.EAST, eastWall);
            newRoom.setSide(Direction.WEST, westWall);
            mazeRooms.add(newRoom);
        }
        IntStream wayOut = hazardGenerator.ints(21, 1, 42);
    }
    private setRoomSides(Room room){

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