
void setup() 
{
  pinMode(3,OUTPUT);
  pinMode(4,OUTPUT);
  pinMode(6,OUTPUT);
  pinMode(7,OUTPUT);
}

void loop() 
{
  digitalWrite(3,HIGH);
  digitalWrite(4,LOW);
  digitalWrite(7,HIGH);
  digitalWrite(6,LOW);
  delay(10000);
  digitalWrite(3,LOW);
  digitalWrite(4,HIGH);
  digitalWrite(7,LOW);
  digitalWrite(6,HIGH);
  delay(10000);
}
