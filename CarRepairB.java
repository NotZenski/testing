public ArrayList<Integer> availableMechanics()
{
  ArrayList<Integer> availableList = new ArrayList<Integer>();
  for (int i = 0; i < numberOfMechanics; i++) 
  {
    int count = 0;
    for (CarRepair c: schedule)
    {
      if (c.getMechanicNum() == i)
      {
        count++;
      }
    }
    if (count == 0)
    {
      availableList.add(i);
    }
  }
  return availableList;
}