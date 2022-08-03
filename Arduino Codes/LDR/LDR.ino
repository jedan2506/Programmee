int ldr=8;
void setup() 
{
  pinMode(ldr,INPUT);
  Serial.begin(9600);
}

void loop() 
{
  int i=analogRead(ldr);
  Serial.println("Reading:: "+i);
  delay(500);
}
