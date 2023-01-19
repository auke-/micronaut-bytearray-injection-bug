package io.codegen.downstream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.codegen.upstream.UpstreamByteConstructorBean;
import io.codegen.upstream.UpstreamByteFieldBean;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class InjectionReproducerTest {

  @Inject
  EmbeddedApplication<?> application;

  @Test
  void testItWorks() {
    Assertions.assertTrue(application.isRunning());
  }

  @Test
  void testByteArrayFieldInjectionFromSameProject() {
    ByteFieldBean bean = application.getApplicationContext().getBean(ByteFieldBean.class);
    assertEquals("some-bytes", bean.toString());
  }

  @Test
  void testByteArrayConstructorInjectionFromSameProject() {
    ByteConstructorBean bean = application.getApplicationContext()
        .getBean(ByteConstructorBean.class);
    assertEquals("some-bytes", bean.toString());
  }

  @Test
  void testByteArrayFieldInjectionFromAnotherProject() {
    UpstreamByteFieldBean bean = application.getApplicationContext()
        .getBean(UpstreamByteFieldBean.class);
    assertEquals("some-bytes", bean.toString());
  }

  @Test
  void testByteArrayConstructorInjectionFromAnotherProject() {
    UpstreamByteConstructorBean bean = application.getApplicationContext()
        .getBean(UpstreamByteConstructorBean.class);
    assertEquals("some-bytes", bean.toString());
  }

}
