//The classes referenced should be in a package called main.java.music.
//
//We start with a base, abstract class Instrument.
//
//it reserves (e.g. protected) the name of the instrument
//it should provide a play() method.

package main.java.music;

public abstract class Instrument {
  protected String nameOfIntrument;

  public abstract void play();
}
