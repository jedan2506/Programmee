int LED[]={6,5,4,3,2,1};
void setup()
{
  for(int i=0;i<6;i++)
  {
   pinMode(LED[i],OUTPUT); 
  }

}

void loop()
{ int j;
  for(j=0;j<6;j++)
  {
    digitalWrite(LED[j],HIGH);
    delay(50);
    digitalWrite(LED[j],LOW);
    delay(50);
    }
    if(j==6)
    {
      for(j=4;j>=1;j--)
  {
    digitalWrite(LED[j],HIGH);
    delay(50);
    digitalWrite(LED[j],LOW);
    delay(50);
    }
    }
}



