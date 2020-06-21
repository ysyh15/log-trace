package com.lllis.log.trace.sniffer.agent.core.transformer;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author lllis
 */
public class LogTraceTransformer implements ClassFileTransformer {

  public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
      ProtectionDomain protectionDomain, byte[] classfileBuffer)
      throws IllegalClassFormatException {
    try {
      System.out.println(loader.toString());
      System.out.println(className);
    } catch (Exception e) {

    }
    return null;
  }
}
