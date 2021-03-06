/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * This software is released under the 2-clause BSD license.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.concrete.validation;

import java.util.UUID;

import org.apache.thrift.TBase;
import org.apache.thrift.TFieldIdEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.uuid.UUIDFactory;

/**
 * Abstract validation class. Focusing on immutable values, attempt to
 * easily provide validation methods that can be used in downstream tools.
 */
public abstract class AbstractAnnotation<T extends TBase<T, ? extends TFieldIdEnum>> {

  protected final Logger logger = LoggerFactory.getLogger(AbstractAnnotation.class);
  protected final T annotation;

  /**
   *
   */
  /*
   * I don't think this will ever throw, but the possibility exists.
   */
  @SuppressWarnings("unchecked")
  public AbstractAnnotation(T annotation) {
    this.annotation = (T) annotation.deepCopy();
  }

  /**
   * Implementors should implement this method, which will be called to
   * attempt to validate the annotation object, via {@link #validate(Communication)}.
   * <br>
   * <br>
   * As a result, you don't need to call {@link #isValid()} on everything
   * in your implementation of {@link #isValidWithComm(Communication)}.
   *
   * @see #validate(Communication)
   * @param c - A communication associated with the {@link AbstractAnnotation}.
   * @return <code>true</code> if valid.
   */
  protected abstract boolean isValidWithComm(Communication c);

  /**
   * Annotations also have a notion of 'validity' on their own. For example,
   * a {@link UUID} string may not be a correct UUID string, thus invalidating
   * the individual annotation.
   *
   * @return <code>true</code> if the individual annotation is valid.
   */
  public abstract boolean isValid();

  /**
   * Public validation interface.
   * <br>
   * <br>
   * Note that the call to {@link #isValid()} will short-circuit,
   * avoiding unnecessary further validation if <code>false</code>.
   *
   * @param c a {@link Communication} to validate
   * @return <code>true</code> if both the individual annotation is valid
   * and it is valid in context of the passed in {@link Communication} object.
   */
  public boolean validate(Communication c) {
    return this.isValid() && this.isValidWithComm(c);
  }

  /**
   * Get a copy of the annotation.
   * <br>
   * <br>
   * For sanity's sake, return a copy, not the original. This prevents issues
   * when fields are mutated after the {@link AbstractAnnotation} is created.
   */
  /*
   * I don't think this will ever throw, but the possibility exists.
   */
  @SuppressWarnings("unchecked")
  public T getAnnotation() {
    return (T) this.annotation.deepCopy();
  }

  /**
   * Print a message, then evaluate a boolean condition.
   * <br>
   * <br>
   * This stinks, but easiest way I could see about informing the user
   * about invalid things.
   *
   * @param st - the string to print
   * @param exp - the returned boolean value
   * @return 2nd parameter (boolean)
   */
  protected boolean printStatus(String st, boolean exp) {
    logger.trace("Evaluating annotation: {}", this.annotation.toString());
    String paramd = "\t{} = {}";
    if (exp)
      logger.trace(paramd, st, "OK");
    else
      logger.info(paramd, st, "Failed");

    return exp;
  }

  /**
   * Convenience method for UUID checking.
   *
   * @param uuidToCheck
   * @return true if it is a valid UUID
   */
  protected boolean validateUUID(String uuidToCheck) {
    return this.printStatus("UUID string must be valid UUID", UUIDFactory.isValidUUID(uuidToCheck));
  }

  protected boolean validateUUID(edu.jhu.hlt.concrete.UUID uuid) {
    if (uuid != null)
      return this.validateUUID(uuid.getUuidString());
    else
      return this.printStatus("UUID was null!", false);
  }
}
