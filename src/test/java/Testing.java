import controller.Factory;
import entities.Playable;
import entities.Styles;
import model.Disc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {
    Disc disc;
    @Before
    public void setUp(){
        disc = new Disc();
        disc.addSong(Factory.createOne("Song","Hey Jude", Styles.Rock, "The Beatles", 200000));
        disc.addSong(Factory.createOne("Opera","Ghost of opera", Styles.Classical, "Webber", 500000));
        disc.addSong(Factory.createOne("Track","Yo", Styles.HipHop, "Noname", 199999));
        disc.addSong(Factory.createOne("Symphony","6th", Styles.Classical, "Mozart", 400001));
        disc.addSong(Factory.createOne("Song","What a wonderful world", Styles.Jazz, "Lui Armstrong", 200001));

    }
    @Test
    public void testDurationOfAll(){
        assertEquals(1500001,disc.calculateDuration());
    }
    @Test
    public void testOrder(){
        Playable ghost = disc.getPlayableImpl(1);

        assertEquals(ghost.play(),disc.getPlayableImpl(1).play());
        disc.bubbleSortByStyle();
        assertEquals(ghost.play(),disc.getPlayableImpl(0).play());
    }
    @Test
    public void testDurationDiapason(){
        assertEquals("[ HipHop Yo ]",disc.findByDiapasonDuration(100000,200000));
    }

}
