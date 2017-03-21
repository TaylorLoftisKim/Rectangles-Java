import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void newCube_instantiatesCorrectly() {
    Rectangle test Rectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEqualls(true, testCube instanceof Cube);
  }

  @Test void newCube_savesRectangleInfo_Rectangle() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(testRectangle), testCube.getFace());
  }

}
