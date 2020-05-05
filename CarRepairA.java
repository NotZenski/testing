public boolean addRepair(int m, int b) 
{
  for (CarRepair c: schedule) 
  {
    if (c.getMechanicNumber() == m || c.getBayNum() == b) 
    {
      return false;
    }
  }
  schedule.add(new CarRepair(m, b));
  return true;
}