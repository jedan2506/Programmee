int ir=8;
int led=13;

void setup() 
{
  pinMode(ir,INPUT);
  pinMode(led,OUTPUT);
  Serial.begin(9600);
}

void loop() 
{
  int i=digitalRead(ir);
  Serial.println(i);
  if(i==HIGH)
  digitalWrite(led,HIGH);
  else
  digitalWrite(led,LOW);
  delay(1000);
}
