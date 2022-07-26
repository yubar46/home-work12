import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashMapTest {
    Map<String, String> map = new HashMap<String, String>();
    @BeforeEach
    void init(){
        map.clear();
    }
    @Test
    void clearMustRemoveAllElements() {


        map.put("name", "hossein");
        map.put("family", "mousvai");
        map.clear();
        assertNull(map.get("name"));
        assertNull(map.get("family"));
    }



    @Test
    void getMustReturnPutElement() {

        assertNull(map.get("name"));
        map.put("name", "hossein");
        assertEquals(map.get("name"), "hossein");

    }

    @Test
    void getMustReturnLastPutElement() {


        map.put("name", "hassan");
        map.put("name", "hossein");
     //   assertEquals(map.get("name"), "hossein");
        assertThat(map.get("name")).isEqualTo("hossein");
    }

    @Test
    void getWithNullKeyMustReturnElement(){
        map.put(null,"hossein");
        assertEquals(map.get(null),"hossein");

    }

    @Test
    void test(){
        map.put("x","y");
        assertEquals(map.size(),1);
    }
}
