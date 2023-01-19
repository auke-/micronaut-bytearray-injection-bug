package io.codegen.upstream;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.nio.charset.StandardCharsets;

@Singleton
public class UpstreamByteFieldBean {

  @Named("some-bytes")
  public byte[] bytes;

  @Override
  public String toString() {
    return new String(bytes, StandardCharsets.UTF_8);
  }
}
