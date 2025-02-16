package com.directi.training.ocp.exercise_refractored;

public interface Ressource {
    
    public void markSlotBusy(int ressourceId);
    public void markSlotFree(int ressourceId);
    public int  findFreeSlot();

}
    

