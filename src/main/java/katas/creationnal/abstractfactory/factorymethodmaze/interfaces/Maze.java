package katas.creationnal.abstractfactory.factorymethodmaze.interfaces;

import katas.creationnal.abstractfactory.factorymethodmaze.interfaces.Room;
import java.util.List;

public interface Maze{
    public void addRoom(Room r);
    public void addRoomList(List<Room> roomList);
}