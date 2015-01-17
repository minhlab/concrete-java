/*
 * Copyright 2012-2014 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package concrete.util.concurrent;

import java.util.concurrent.Callable;

import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.serialization.CommunicationSerializer;
import edu.jhu.hlt.concrete.serialization.ThreadSafeCompactCommunicationSerializer;
import edu.jhu.hlt.concrete.util.ConcreteException;

/**
 * @author max
 *
 */
public class CallableBytesToCommunication implements Callable<Communication> {

  private final CommunicationSerializer cs = new ThreadSafeCompactCommunicationSerializer();
  private final byte[] bytes;
  
  public CallableBytesToCommunication (byte[] bytes) {
    this.bytes = bytes;
  }
  
  @Override
  public Communication call() throws ConcreteException {
    return this.cs.fromBytes(this.bytes);
  }
}