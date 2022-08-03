int l=1;
void setup() {
  Serial.begin(9600);

}

void loop() 
{
  
  Serial.println(l);
  delay(100);
  l++;
  if(l>50)
  l=1;
}
