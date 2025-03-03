package com.directi.training.ocp.exercise_refractored;


public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Ressource resourceType)
    {
        int resourceId;

        try{
            resourceId = resourceType.findFreeSlot();
            resourceType.markSlotBusy(resourceId);

        } catch (Exception e) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        }
        
        return resourceId;
    }

    public void free(Ressource resourceType, int resourceId)
    {
        try {
            resourceType.markSlotFree(resourceId);
        }
        catch (Exception e) {
            System.out.println("ERROR: attempted to free invalid resource");
        }
    }

}
