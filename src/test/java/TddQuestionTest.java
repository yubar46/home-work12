import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TddQuestionTest {
    @Test
    void getBiggerThanTreeDigitMustReturnOneDigit(){
        TddQuestion tddQuestion = new TddQuestion();
        assertThat(tddQuestion.getBiggerThanTwo("b123gfgddg")).isEqualTo("123");
    }
    @Test
    void getBiggerThanTreeDigitMustReturnMultiSeparateDigit(){
        TddQuestion tddQuestion = new TddQuestion();
        assertThat(tddQuestion.getBiggerThanTwo("b123gfgdd1254g111")).isEqualTo("123,1254,111");
    }
    @Test
    void getBiggerThanTreeDigitMustReturnNull(){
        TddQuestion tddQuestion = new TddQuestion();
        assertNull(tddQuestion.getBiggerThanTwo("12bdbfdbd12fbdf"));
    }
   @ParameterizedTest(name = "{0}={1}")
   @CsvSource({"123vdvd, 123",
   "12345, 12345"})
   void withParameter(String input,String expected){
       TddQuestion tddQuestion = new TddQuestion();
       assertThat(tddQuestion.getBiggerThanTwo(input)).isEqualTo(expected);
   }

   @Test
    void getBiggerThanTwoWithStreamMustReturnOneDigitBiggerThan99(){
        TddQuestion tddQuestion = new TddQuestion();
        assertThat(tddQuestion.getBiggerThanTwoWithStream("123nbhjk"))
                .isEqualTo("[123]");
   }
    @Test
    void getBiggerThanTwoWithStreamMustReturnTwoDigitBiggerThan99(){
        TddQuestion tddQuestion = new TddQuestion();
        assertThat(tddQuestion.getBiggerThanTwoWithStream("123nbh555jk"))
                .isEqualTo("[123, 555]");
    }

    @Test
    void getBiggerThanTwoWithStreamMustReturnNoneDigitBiggerThan99(){
        TddQuestion tddQuestion = new TddQuestion();
        assertThat(tddQuestion.getBiggerThanTwoWithStream("12nbh55jk"))
                .isEqualTo("");
    }

}
