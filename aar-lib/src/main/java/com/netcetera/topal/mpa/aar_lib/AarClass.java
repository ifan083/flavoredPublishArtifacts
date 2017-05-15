package com.netcetera.topal.mpa.aar_lib;

import com.example.MyClass;
import com.netcetera.topal.mpa.aar_lib.specific.FlavorClass;

/**
 * Created by ivilievs on 15.05.17.
 */

public class AarClass {

  public MyClass returnMyClass() {
    return new MyClass();
  }

  public FlavorClass returnFlavoredClass() {
    return new FlavorClass();
  }

}
