package problem5;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> line = new Vector<>();


    public void kidnap(Person p) {
        line.add(p);
    }

 
    public boolean willDragonEatOrNot() {
        int writeIndex = 0;

        for (int i = 0; i < line.size(); i++) {
            line.set(writeIndex, line.get(i));
            writeIndex++;

    
            if (writeIndex >= 2) {
                Person p1 = line.get(writeIndex - 2);
                Person p2 = line.get(writeIndex - 1);

                if (p1.getGender() == Gender.BOY &&
                    p2.getGender() == Gender.GIRL) {
                
                    writeIndex -= 2;
                }
            }
        }

        return writeIndex > 0;
    }

    
    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();


        dragon.kidnap(new Person("A", Gender.BOY));
        dragon.kidnap(new Person("B", Gender.BOY));
        dragon.kidnap(new Person("C", Gender.GIRL));
        dragon.kidnap(new Person("D", Gender.GIRL));

        System.out.println(
            dragon.willDragonEatOrNot()
            ? "Dragon will eat 😈"
            : "No lunch today 😢"
        );
    }
}
