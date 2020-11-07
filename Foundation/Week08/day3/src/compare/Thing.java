package compare;

public class Thing /* implements Comparable <Thing> */{
  private boolean name;
  private boolean completed;

  public Thing(boolean name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  //@Override
  //    public int compareTo(Thing that) {
  //      if (completed && name){
  //        return that.toString();
  //      } return "";
  //  }

}

