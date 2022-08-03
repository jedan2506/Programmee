int LED1=5;
int LED2=4;
int LED3=3;
void setup()
{
  Serial.begin(9600);
pinMode(LED1,OUTPUT); 
pinMode(LED2,OUTPUT); 
pinMode(LED3,OUTPUT); 
}

void loop()
{
digitalWrite(LED1,HIGH);
Serial.println("Green");
delay(500);
digitalWrite(LED1,LOW);
delay(500);
digitalWrite(LED2,HIGH);
Serial.println("White");
delay(500);
digitalWrite(LED2,LOW);
delay(500);
digitalWrite(LED3,HIGH);
Serial.println("Yellow");
delay(500);
digitalWrite(LED3,LOW);
delay(500);
}
