package com.directi.training.lsp.exercise_refractored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
        electricDuck.turnOff();
    }

    private void quack(Duckable... ducks)
    {
        for (Duckable duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duckable... ducks)
    {
        for (Duckable duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}