package fr.devoxx.niveau3.exo3;

import com.google.auto.service.AutoService;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@AutoService(Processor.class)
/**
 * Grâce à la détection implémentée dans AbstractProcessor,
 * il est possible de déclarer par annotation au niveau du type
 * du processor quelle(s) annotation(s) ce dernier supporte.
 *
 * Il faut donc le préciser ici.
 * @see {@link javax.annotation.processing.AbstractProcessor#getSupportedAnnotationTypes()}
 */
public class ErbfeindGenerator extends AbstractProcessor {

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latest();
  }

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    System.out.println("What's going on here?");
    return false;
  }
}
