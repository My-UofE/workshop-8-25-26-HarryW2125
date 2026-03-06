
public class MovableCircle implements Movable { 
  private MovablePoint center;
  private int radius;
  
  MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    this.radius = radius;

  }
  
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

    @Override
  public void moveDown() {
	 center.moveDown();// move the center up
  }

  	@Override
	public void moveLeft() {
		center.moveLeft();
	}

		@Override
	public void moveRight() {
		center.moveRight(); // moves y point up by increment ySpeed
	}

  	public String toString() {
		return(String.format("MovableCircle[center_x=%d,center_y=%d,xSpeed=%d,ySpeed=%d,radius=%d]",center.x,center.y,center.xSpeed,center.ySpeed,radius));
	}
}
