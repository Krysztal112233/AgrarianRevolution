package dev.krysztal.advagri.foundation.util;

import dev.krysztal.advagri.foundation.util.annotations.GenType;
import dev.krysztal.advagri.foundation.util.annotations.GenTypes;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratorUtils {

  public static class Collector {

    final GenType genTypes;

    public Collector(GenType genType) {
      this.genTypes = genType;
    }

    public <T> ArrayList<T> collect(Class<?> clazz) {
      var arrayList = new ArrayList<T>();
      Arrays
        .stream(clazz.getFields())
        .filter(field -> {
          var anno = field.getAnnotation(GenTypes.class);
          if (anno == null) return false;
          return Arrays
            .stream(anno.types())
            .anyMatch(genType -> genType == this.genTypes);
        })
        .forEach(field -> {
          try {
            field.setAccessible(true);
            var casted = (T) field.get(clazz);
            field.setAccessible(false);
            arrayList.add(casted);
          } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
          }
        });

      return arrayList;
    }
  }
}
