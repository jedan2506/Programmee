int ldr=A0;
int led=10;

void setup()
{
  Serial.begin(9600);
  pinMode(led,OUTPUT);
  pinMode(ldr,INPUT);
}

void loop()
{
  int ldr_read=analogRead(ldr);
  Serial.println(ldr_read);
  if(ldr_read<=100)
  {
    digitalWrite(led,HIGH);
  }
  else
  {
    digitalWrite(led,LOW);
  }
  delay(1000);
}
