int r=7;
int g=6;
int b=5;

void setup() 
{
  pinMode(r,OUTPUT);
  pinMode(g,OUTPUT);
  pinMode(b,OUTPUT);
  digitalWrite(r,HIGH);
  digitalWrite(b,HIGH);
  digitalWrite(g,HIGH);
}

void loop() 
{
  digitalWrite(r,LOW);
  digitalWrite(b,LOW);
  digitalWrite(g,LOW);

}
