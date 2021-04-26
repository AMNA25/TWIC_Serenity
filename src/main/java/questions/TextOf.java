package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextOf {
    public static Question<String> theFieldNamed(Target field) {
        return Question.about("Text of the element").answeredBy(
                Text.of(field).asAString()
        );
    }
}
