int AO=0;
int LED=13;
float voltage;
void setup()
{
  Serial.begin(9600);
  pinMode(AO,INPUT);
  pinMode(LED,OUTPUT);
  
}

void loop() 
{
  int l=analogRead(AO);
  //Serial.println(l);
  delay(1000);
  voltage=l*(5.0/1023.0);
  Serial.print("VOL:: ");
  Serial.println(voltage);
  if(voltage>2.5)
  digitalWrite(LED,HIGH);
  else
  digitalWrite(LED,LOW);
}
