package io.codegen.downstream;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.nio.charset.StandardCharsets;

@Singleton
public class ByteConstructorBean {

  private final byte[] bytes;

  public ByteConstructorBean(@Named("some-bytes") byte[] bytes) {
    this.bytes = bytes;
  }

  @Override
  public String toString() {
    return new String(bytes, StandardCharsets.UTF_8);
  }
}
