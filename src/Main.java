public class Main {
    public static void main(String[] args) {
        //Object instantiation
        MovingObject objOne = new MovingObject("CAR");

        // Display Object Name
        System.out.println("Object Name:" + objOne.getObjName());

        objOne.setObjTurn("START");

        objOne.moveForward(3);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(4);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(3);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(2);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(2);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(3);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(2);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(3);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(1);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(5);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(2);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(1);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(2);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(3);
            objOne.setObjTurn("LEFT");

        objOne.moveForward(2);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(6);
            objOne.setObjTurn("RIGHT");

        objOne.moveForward(2);
    }
}
