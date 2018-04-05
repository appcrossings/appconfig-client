package com.appcrossings.config.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesProcessor {

  public static Properties asProperties(InputStream stream) {

    try {

      Properties props = new Properties();
      props.load(stream);
      return props;

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static boolean isPropertiesFile(String path) {

    assert StringUtils.hasText(path) : "Path was null or empty";
    return (path.toLowerCase().endsWith(".properties"));
  }

}
