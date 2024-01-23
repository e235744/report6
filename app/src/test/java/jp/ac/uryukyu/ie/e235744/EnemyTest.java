package jp.ac.uryukyu.ie.e235744;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

class EnemyTest {

    @Test void attackTest() {
        String simulatedUserInput = "1\n1\n1\n1\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedUserInput.getBytes());
        System.setIn(testIn);
        Hero hero = new Hero();
        Enemy enemy = new Enemy();

        for (int i = 0; i < 5; i++) {
            enemy.attack(hero);
            hero.attack(enemy);
        }

        assertEquals(40,enemy.getHp());
    }
}