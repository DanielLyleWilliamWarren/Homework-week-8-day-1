import models.Golfer;
import db.DBGolfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Jack", "Nic", 32);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Henry", "Bob", 65);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("David", "Lammy", 23);
        DBGolfer.save(golfer3);

        List<Golfer> golfers = DBGolfer.getAll();

        Golfer jack = DBGolfer.find(golfer1.getId());

        System.out.print(jack.getFirstName());

//        System.exit(0);

    }
}


