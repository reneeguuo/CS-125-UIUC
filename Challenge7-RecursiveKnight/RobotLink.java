//UIUC CS125 FALL 2022 MP. File: RobotLink.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2022-11-12T09:11:45-0600.037093451
//@author angrave
public class RobotLink {

	private RobotLink next; 	
	private final Robot robot;

	public Robot getRobot() {
		return robot;
	}
	/** Constructs this link.
	 * @param next ; the next item in the chain (null, if there are no more items).
	 * @param robot ; a single robot (never null).
	 */
	public RobotLink(RobotLink next,Robot robot) {
		this.robot = robot;
		this.next = next;
	}

	/**
	 * Returns the number of entries in the linked list.
	 * @return number of entries.
	 */
	public int count() {
		if (next == null)
			return 1; // BASE CASE; no more recursion required!

		// Recursive case:
		return 1 + next.count();
	}
	/**
	 * Counts the number of flying robots in the linked list.
	 * Hint: robot.isFlying is useful here.
	 */
	public int countFlyingRobots() {
		if (this.next==null) {
			if (this.robot.isFlying())
				return 1;
			else
				return 0;
		}

		if (this.robot.isFlying())
			return 1 + this.next.countFlyingRobots();
		else
			return this.next.countFlyingRobots();
	}
	/**
	 * Counts the number of flying robots upto and excluding a sad robot.
	 * (i.e. do not count the sad robot if it is flying).
	 * If there are no sad robots this function will return the same value as countFlyingRobots().
	 * Hint: robot.isHappy() is useful.
	 */
	public int countFlyingRobotsBeforeSadRobot() {
		if (this.robot.isHappy()==false)
			return 0;

		if (this.next==null) {
			if (this.robot.isFlying())
				return 1;
			else
				return 0;
		}

		if (this.robot.isFlying())
			return 1 + this.next.countFlyingRobotsBeforeSadRobot();
		else
			return this.next.countFlyingRobotsBeforeSadRobot();

	}
	/** Creates a new LinkedList entry at the end of this linked list.
	 * Recursively finds the last entry then adds a new link to the end.
	 * @param robot - the robot value of the new last link
	 */
	public void append(Robot robot) {
		if (this.next!=null) {
			this.next.append(robot);
		}
		else this.next = new RobotLink(null, robot);
	}
	/**
	 * Returns the first flying unhappy robot, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getFirstFlyingUnhappyRobot() {
		if (this.robot.isFlying() && !this.robot.isHappy())
			return this.robot;

		if (this.next==null) {
			return null;
		}
		return this.next.getFirstFlyingUnhappyRobot();
	}
	/**
	 * Returns the last flying unhappy robotn the linked list, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getLastFlyingUnhappyRobot() {

		if (this.next!=null) {
			if (this.next.getLastFlyingUnhappyRobot()!=null) {
				return this.next.getLastFlyingUnhappyRobot();
			}
			else {
				if (this.robot.isFlying() && !this.robot.isHappy()) {
					return this.robot;
				}
				else return null;
			}
		}
		else {
			if (this.robot.isFlying() && !this.robot.isHappy()) {
				return this.robot;
			}
			else return null;
		}
	}
	/**
	 * Returns a reference to the happy most distant explorer.
	 * Returns null if there are no happy robots
	 * @return reference to the most distant happy robot
	 */
	public Robot findHappyRobotFurthestFromHome() {
		if (this.robot.isHappy()) {
			if (this.next!=null) {
				Robot r = this.next.findHappyRobotFurthestFromHome();
				double d = r.getDistanceFromHome();
				return this.robot.getDistanceFromHome()>d ? this.robot : r;
			}
			else return this.robot;
		}
		else {
			if (this.next!=null)
				return this.next.findHappyRobotFurthestFromHome();
			else return null;
		}
	}
	/**
	 * Returns true if linked list contains the robot.
	 * Hint: Use robot.equals(other).
	 * @param robot
	 * @return
	 */
	public boolean contains(Robot other) {
		if (this.next!=null) {
			if (this.robot.equals(other)) return true;
			else return this.next.contains(other);
		}
		else {
			if (this.robot.equals(other)) return true;
			else return false;
		}
	}

	
}
