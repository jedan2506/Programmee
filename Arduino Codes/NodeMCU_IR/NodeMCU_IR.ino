#include <ESP8266WiFi.h>
int out=0;
int val=0;
void setup()
{
  pinMode(out,INPUT);
  Serial.begin(9600);
}
void loop()
{
  val=digitalRead(out);
  Serial.println(val);
  delay(1000);
}

