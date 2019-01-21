package katas.creationnal.abstractfactory.factorymethodmaze.interfaces;

import katas.creationnal.abstractfactory.factorymethodmaze.enums.Direction;

public interface Room{
    public void setSide(Direction dir, Wall wall);
}