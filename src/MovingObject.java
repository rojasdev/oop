public class MovingObject {
    String objName;
    int objCurPosX = 1;
    int objCurPosY = 1;
    String objDirection = "SOUTH"; // NORTH, SOUTH, EAST, WEST
    String objTurn; // LEFT, RIGHT

    public MovingObject(String objName) {
        this.objName = objName;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjTurn(String objTurn) {
        this.objTurn = objTurn;
        if(objDirection.equals("SOUTH") && objTurn.equals("LEFT")){
            objDirection = "EAST";
        }else if(objDirection.equals("SOUTH") && objTurn.equals("RIGHT")){
            objDirection = "WEST";
        }else if(objDirection.equals("NORTH") && objTurn.equals("RIGHT")){
            objDirection = "EAST";
        }else if(objDirection.equals("NORTH") && objTurn.equals("LEFT")){
            objDirection = "WEST";
        }else if(objDirection.equals("EAST") && objTurn.equals("LEFT")){
            objDirection = "NORTH";
        }else if(objDirection.equals("EAST") && objTurn.equals("RIGHT")){
            objDirection = "SOUTH";
        }else if(objDirection.equals("WEST") && objTurn.equals("LEFT")){
            objDirection = "SOUTH";
        }else if(objDirection.equals("WEST") && objTurn.equals("RIGHT")){
            objDirection = "NORTH";
        }else{
            objDirection = "SOUTH";
        }
        System.out.println("Object now facing: " + objDirection);
    }

    public void moveForward(int steps) {
        if(objDirection.equals("SOUTH") && objTurn.equals("START")){
            objCurPosY += steps;
        }else if(objDirection.equals("SOUTH") && objTurn.equals("RIGHT")){
            objCurPosY += steps;
        }else if(objDirection.equals("SOUTH") && objTurn.equals("LEFT")){
            objCurPosY += steps;
        }else if(objDirection.equals("NORTH") && objTurn.equals("LEFT")){
            objCurPosY -= steps;
        }else if(objDirection.equals("NORTH") && objTurn.equals("RIGHT")){
            objCurPosY -= steps;
        }else if(objDirection.equals("EAST") && objTurn.equals("RIGHT")){
            objCurPosX += steps;
        }else if(objDirection.equals("EAST") && objTurn.equals("LEFT")){
            objCurPosX += steps;
        }else if(objDirection.equals("WEST") && objTurn.equals("RIGHT")) {
            objCurPosX -= steps;
        }else if(objDirection.equals("WEST") && objTurn.equals("LEFT")) {
            objCurPosX -= steps;
        }


        System.out.println("Object Moved " + steps + " step(s) towards " + objDirection);
        System.out.println("Object Current Position X: " + objCurPosX);
        System.out.println("Object Current Position Y: " + objCurPosY);

    }
}
