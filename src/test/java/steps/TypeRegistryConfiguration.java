package steps;

import Modelo.Color;
import Modelo.Paper;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;

import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry( TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<Color>(
                "color",
                "red|blue|yellow",
                Color.class,
                new Transformer<Color>() {
                    @Override
                    public Color transform( String arg ) throws Throwable {
                        return new Color(arg);
                    }
                })
        );


    }
}