public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Avtara";
        manager.sayHello("joko");

        var vp = new VicePresident();
        vp.name = "Avtara";
        vp.sayHello("joko");
    }
}
