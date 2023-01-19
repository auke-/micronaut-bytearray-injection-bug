package io.codegen.downstream;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.nio.charset.StandardCharsets;

@Singleton
public class ByteFieldBean {

  @Named("some-bytes")
  public byte[] bytes;

  @Override
  public String toString() {
    return new String(bytes, StandardCharsets.UTF_8);
  }
}
