package {{packageName}};

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class) //
@Config(manifest = Config.NONE)
public class MyClassTest {
  @Before public void setUp() {
  }

  @After public void tearDown() {
  }

  @Test public void someTest() {
  }
}
