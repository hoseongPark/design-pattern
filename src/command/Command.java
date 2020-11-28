package command;

public abstract class Command {
    protected Robot robot;

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public abstract void execute();
}

class MoveForwardCommand extends Command {

    int space;

    public MoveForwardCommand(int spcae) {
        this.space = spcae;
    }

    @Override
    public void execute() {
        robot.moveForward(space);
    }
}

class TurnCommand extends Command {

    Robot.Direction direction;

    public TurnCommand (Robot.Direction direction) {
        this.direction = direction;
    }

    @Override
    public void execute() {
        robot.turn(direction);
    }
}

class PickupCommand extends Command {

    @Override
    public void execute() {
        robot.pickup();
    }
}