package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass) {
        switch(taskClass) {
            case DRIVING:
                DrivingTask.completed = true;
                return new DrivingTask("Route 1", "McDonalds", "Car");
            case PAINTING:
                PaintingTask.completed = true;
                return new PaintingTask("Painting Job 1", "Red", "Wall");
            case SHOPPING:
                ShoppingTask.completed = true;
                return new ShoppingTask("Shopping 1", "Apples", 3.0);
            default:
                return null;
        }
    }
}
