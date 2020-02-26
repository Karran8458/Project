public class ProjectTest {
    public static void main(String[] args) {
        Project elevatorPitch = new Project("Karran Gowda", "I am a student");
        String name = elevatorPitch.changeName("Kman Gowda");
		String desc = elevatorPitch.changeName("Howdy sheriff!");
		System.out.println("Name: " + name + " Description: " + desc);
    }
}
