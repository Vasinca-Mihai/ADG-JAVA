package Project.Template;

import Project.Template.Enemy_types.*;

public class Main {
    public static void main(String[] args) {
        Warden w = new Warden();
        Snake s = new Snake();
        Goblin g = new Goblin();
        SmartGoblin sg = new SmartGoblin();
        CriiperTM c = new CriiperTM();
        FlyTrap f = new FlyTrap();

        System.out.println("    Goblin:"); g.mainBehavior(20);
        System.out.println("\n    Warden:"); w.mainBehavior(50);
        System.out.println("\n    Snake:"); s.mainBehavior(50);
        System.out.println("\n    Smart Goblin:"); sg.mainBehavior(30);
        System.out.println("\n    CriiperTM:"); c.mainBehavior(50);
        System.out.println("\n    Fly trap:"); f.mainBehavior(10);
    }
}
