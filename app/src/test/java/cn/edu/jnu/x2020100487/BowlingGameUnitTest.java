package cn.edu.jnu.x2020100487;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    public void test20Zeros(){
        BowlingGame game=new BowlingGame();
        for(int i=0;i<20;i++){
            game.roll(0);
        }
        assertEquals(0,game.score());
    }
}