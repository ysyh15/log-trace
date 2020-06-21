package com.lllis.log.trace.sniffer.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author lllis
 */
public class LogTraceAgent {

  public static void premain(String agentArgs, Instrumentation instrumentation) {
    System.out.println("this is log-trace agent premain ....");
  }
}
