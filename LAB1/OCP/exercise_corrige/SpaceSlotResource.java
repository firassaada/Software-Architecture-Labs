package com.directi.training.ocp.exercise_corrige;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotFree(int resourceId) {
    }

    private void markSpaceSlotBusy(int resourceId) {
    }

    private int findFreeSpaceSlot() {
        return 0;
    }
}
