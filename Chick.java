class Chick implements Animal
{
  private String myType;
  private String mySound;
  private String mySound2;
  private int n;
  public Chick(String type, String sound, String sound2)
  {
    myType = type;
    mySound = sound;
    mySound = sound2;
  }
  public Chick()
  {
  myType = "unknown";
  mySound = "unknown";
  }

  public String getSound()
    {
     n = (int)(Math.random()*2);
    if (n==0)
      return  mySound;
    else 
      return mySound2;
  }
  public String getType() {
  return myType;
  }
}
