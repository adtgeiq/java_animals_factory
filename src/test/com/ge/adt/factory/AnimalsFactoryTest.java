package test.com.ge.adt.factory;

import com.ge.adt.factory.AnimalsFactory;
import junit.framework.TestCase;

public class AnimalsFactoryTest extends TestCase {

    public void testCat() {
        AnimalsFactory animalsFactory = new AnimalsFactory();
        assertEquals("Meaow", animalsFactory.getAnimal("cat").makeASound());
    }

    public void testPenguin() {
        AnimalsFactory animalsFactory = new AnimalsFactory();
        assertEquals("waddled", animalsFactory.getAnimal("penguin").walk());
    }

    public void testDolphin() {
        AnimalsFactory animalsFactory = new AnimalsFactory();
        assertEquals("bleat", animalsFactory.getAnimal("dolphin").makeASound());
    }


}