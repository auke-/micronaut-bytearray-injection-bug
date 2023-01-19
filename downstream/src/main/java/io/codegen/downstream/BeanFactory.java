package io.codegen.downstream;

import io.codegen.upstream.UpstreamByteConstructorBean;
import io.codegen.upstream.UpstreamByteFieldBean;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Import;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.nio.charset.StandardCharsets;

@Import(classes = {UpstreamByteFieldBean.class, UpstreamByteConstructorBean.class})
@Factory
public class BeanFactory {

  @Bean
  @Singleton
  @Named("some-bytes")
  byte[] getSomeBytes() {
    return "some-bytes".getBytes(StandardCharsets.UTF_8);
  }

}
