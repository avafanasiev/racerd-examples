/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package org.example;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    i = 0;
  }

  int getOk() {
    return i;
  }
}
