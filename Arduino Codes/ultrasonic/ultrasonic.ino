
int trig=7;
int echo=5;
double dis=0;
int LED1=6;
int LED2=8;
int buz=9;
void setup() 
{
  pinMode(trig,OUTPUT);
  pinMode(echo,INPUT);
  pinMode(LED1,OUTPUT);
  pinMode(LED2,OUTPUT);
  pinMode(buz,OUTPUT);
  Serial.begin(9600);
}

void loop() 
{
  digitalWrite(trig,LOW);
  digitalWrite(trig,HIGH);
  delayMicroseconds(10);
  digitalWrite(trig,LOW);
  double t=pulseIn(echo,HIGH);
  dis=(0.034*t)/2;
  if(dis>30.00)
  {
  digitalWrite(LED1,HIGH);
  digitalWrite(LED2,LOW);
  }
  else
  {
  digitalWrite(LED2,HIGH);
  digitalWrite(LED1,LOW);
  }
  delay(500);
  digitalWrite(buz,HIGH);
  delay(dis);
  digitalWrite(buz,LOW); 
  Serial.println(dis);
}
