package main.java.katas.creationnal.abstractfactory.factorymethodmaze;

import Direction;

public interface Room{
    public void setSide(Direction dir, Wall wall);
}