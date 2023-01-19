package io.codegen.upstream;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.nio.charset.StandardCharsets;

@Singleton
public class UpstreamByteConstructorBean {

  private final byte[] bytes;

  public UpstreamByteConstructorBean(@Named("some-bytes") byte[] bytes) {
    this.bytes = bytes;
  }

  @Override
  public String toString() {
    return new String(bytes, StandardCharsets.UTF_8);
  }
}
