/*
 * Copyright 2018, ConsenSys Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package net.consensys.cava.io;

import java.io.IOException;

/**
 * Represents an operation that accepts a single input argument and returns no result.
 */
@FunctionalInterface
public interface IOConsumer<T> {

  /**
   * Performs this operation on the given argument.
   *
   * @param t the input argument
   * @throws IOException If an IO error occurs.
   */
  void accept(T t) throws IOException;
}