class Farm
{
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm()
  {
    aBunchOfAnimals[0] = new NamedCow("cow", "Curry", "moooo");
    aBunchOfAnimals[1] = new Chick("chick", "chirp", "jeep");
    aBunchOfAnimals[2] = new Pig("pig", "oink oink");
  }

  public void animalSounds()
    {       
      for (int nI=0; nI < aBunchOfAnimals.length; nI++)       
      {          
        System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());
      } 
      System.out.println("The cow is known as " + (((NamedCow)aBunchOfAnimals[0]).getName()));
    }
}
