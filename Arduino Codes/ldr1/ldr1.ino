int a=0;
int LED=7;
void setup() 
{
  pinMode(a,INPUT);
  pinMode(LED,OUTPUT);
  Serial.begin(9600);
}

int ldr()
{
  int l=analogRead(a);
  if(l>500)
  digitalWrite(LED,HIGH);
  else
  digitalWrite(LED,LOW);
  return l;
}
void loop()
{
  int o=ldr();
  Serial.println(o);
  delay(200);
}
