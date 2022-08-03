int LED=0;
int ir=1;
int val=0;

void setup() 
{
  pinMode(LED,OUTPUT);
  pinMode(ir,INPUT);
  Serial.begin(9600);
}

void loop() 
{
  val=digitalRead(ir);
  Serial.println(val);
  delay(1000);
}
