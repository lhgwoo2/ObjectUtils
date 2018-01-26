import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObjectUtilTest {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @AfterAll
  static void tearDownAfterClass() throws Exception {}

  @BeforeEach
  void setUp() throws Exception {}

  @AfterEach
  void tearDown() throws Exception {}

  @Test
  void nullCheckTest() {
    // fail("Not yet implemented");
    String s = null;
    assertTrue(ObjectUtils.isEmpty(s));
  }

  @Test
  void lengthZeroCheckTest() {
    String s = "";
    assertTrue(ObjectUtils.isEmpty(s));
  }

  @Test
  void mapIsEmptyCheckTest() {
    Map<String, Object> map = new HashMap<>();
    assertTrue(ObjectUtils.isEmpty(map));
  }

  @Test
  void listCheckTest() {
    List<String> list = new ArrayList<String>();
    assertTrue(ObjectUtils.isEmpty(list));
    //assertFalse(ObjectUtils.isEmpty(list));
    
  }

  @Test
  void objectArrayCheckTest() {
    String[] array = new String[0];
    assertTrue(ObjectUtils.isEmpty(array));
  }

}
