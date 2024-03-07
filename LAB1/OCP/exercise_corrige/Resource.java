package com.directi.training.ocp.exercise_corrige;

public interface Resource {
    int allocate();
    void free(int resourceId);
}